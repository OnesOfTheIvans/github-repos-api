package list_repositories.service;

import list_repositories.client.GithubApiClient;
import list_repositories.entities.GithubRepository;
import list_repositories.exceptions.GithubApiException;
import list_repositories.exceptions.UserNotFoundException;
import list_repositories.responses.RepositoryBranchResponse;
import list_repositories.responses.UserRepositoryResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GithubApiService {
    private final GithubApiClient client;

    public GithubApiService(GithubApiClient client) {
        this.client = client;
    }

    public List<UserRepositoryResponse> getUserRepositories(String username) {
        try {
        List<GithubRepository> repos = client.getRepositories(username);

        return repos.stream()
                .filter(repo -> !repo.isFork())
                .map(repo -> {
                    var githubBranches = client.getBranches(username, repo.getName());
                    var branches = githubBranches.stream().map(branch -> new RepositoryBranchResponse(branch.getName(), branch.getCommit().getSha())).collect(Collectors.toSet());
                    return new UserRepositoryResponse(
                            repo.getName(),
                            repo.getOwner().getLogin(),
                            branches
                    );
                })
                .toList();
        } catch (HttpClientErrorException.NotFound e) {
            throw new UserNotFoundException(username);
        } catch (HttpClientErrorException e) {
            throw new GithubApiException("GitHub API error: " + e.getStatusCode(), e, e.getStatusCode().value());
        }
    }
}
