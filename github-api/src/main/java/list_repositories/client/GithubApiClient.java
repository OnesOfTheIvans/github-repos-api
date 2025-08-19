package list_repositories.client;

import list_repositories.entities.GithubBranch;
import list_repositories.entities.GithubRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
public class GithubApiClient {
    private final RestClient restClient;

    public GithubApiClient(@Value("${github.api.url}") String apiUrl,
                           @Value("${github.token}") String token) {
        this.restClient = RestClient.builder()
                .baseUrl(apiUrl)
                .defaultHeader(HttpHeaders.AUTHORIZATION, "token " + token)
                .build();
    }

    public List<GithubRepository> getRepositories(String username) {
        String userRepositoriesUrl = "/users/{username}/repos";
        return restClient.get()
                .uri(userRepositoriesUrl, username)
                .retrieve()
                .body(new ParameterizedTypeReference<List<GithubRepository>>() {
                });
    }

    public List<GithubBranch> getBranches(String owner, String repo) {
        String repositoryBranchesUrl = "/repos/{owner}/{repo}/branches";
        return restClient.get()
                .uri(repositoryBranchesUrl, owner, repo)
                .retrieve()
                .body(new ParameterizedTypeReference<List<GithubBranch>>() {
                });
    }
}
