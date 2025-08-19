package list_repositories_test;

import list_repositories.Main;
import list_repositories.responses.BranchDTO;
import list_repositories.responses.RepositoryDTO;
import list_repositories.service.GithubApiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest(classes = Main.class)
public class GithubIntegrationTest {
    @Autowired
    private GithubApiService githubService;

    @Test
    void shouldFetchRepositoriesForKnownUser() {
        // given
        // octocat - test user from the GitHub API documentation (really existing account)
        String username = "octocat";

        // when
        List<RepositoryDTO> repos = githubService.getUserRepositories(username);

        // then
        assertThat(repos)
                .isNotNull()
                .isNotEmpty();

        assertThat(repos.getFirst().repositoryName()).isNotBlank();

        assertThat(repos)
                .extracting(RepositoryDTO::repositoryName)
                .anyMatch(name -> name.equalsIgnoreCase("Hello-World"));

        assertThat(repos)
                .flatExtracting(RepositoryDTO::branches)
                .extracting(BranchDTO::sha)
                .anyMatch(sha -> sha != null && !sha.isBlank());

        assertThat(repos)
                .filteredOn(repo -> repo.repositoryName().equals("Hello-World"))
                .flatExtracting(RepositoryDTO::branches)
                .filteredOn(branch -> branch.name().equals("master"))
                .extracting(BranchDTO::sha)
                .contains("7fd1a60b01f91b314f59955a4e4d4e80d8edf11d");}
}
