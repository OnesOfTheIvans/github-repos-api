## GitHub Repos API

This project allows you to list all the main information about user branches on GitHub.

### Prerequisites
- Java 21
- Maven

### Configuration
Create a file `application-dev.properties` in `src/main/resources` and override the GitHub token:

```
github.token=REPLACE_WITH_YOUR_TOKEN
```

You can find out how to get your GitHub access token here:
https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens
(official GitHub documentation)

### Running the application
You can run the project using Maven in directory `github-repos-api/gihub-api`:

```
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

### Test running
To run the tests, use Maven in directory `github-repos-api/gihub-api`:

```
mvn test
```

#### Test description
- Checks that the application can fetch repositories for a real GitHub user (`octocat`).
- Makes sure the list of repositories is not empty.
- Confirms that at least one repository is named `Hello-World`.
- Checks that each repository has branches with valid identifiers.
- Verifies that the `Hello-World` repository has a `master` branch with the expected commit sha.

### API Usage
Once running, you can access the API at:

```
http://localhost:8080
```

### Example Endpoints
- `/api/github/repos/{username}` - List all repositories for a given GitHub user

### Notes
- Make sure your GitHub token has the necessary permissions to read repositories.
- The application uses the `dev` profile to load the `application-dev.properties` file.