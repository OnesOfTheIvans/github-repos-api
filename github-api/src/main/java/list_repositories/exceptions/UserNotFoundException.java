package list_repositories.exceptions;

public class UserNotFoundException extends RuntimeException {
    private final String username;

    public UserNotFoundException(String username) {
        super("GitHub user not found: " + username);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
