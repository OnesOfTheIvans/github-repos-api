package list_repositories.controller;

import list_repositories.exceptions.GithubApiException;
import list_repositories.exceptions.UserNotFoundException;
import list_repositories.responses.ErrorResponse;
import list_repositories.responses.Response;
import list_repositories.responses.UserResponse;
import list_repositories.service.GithubApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/github")
public class GithubApiController {
    private final GithubApiService githubService;

    public GithubApiController(GithubApiService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/repos/{username}")
    public Response getUserRepositories(@PathVariable String username) {
        try {
            return new UserResponse(githubService.getUserRepositories(username));
        } catch (UserNotFoundException e) {
            var HTTP_NOT_FOUND = 404;
            return new ErrorResponse(HTTP_NOT_FOUND, e.getMessage());
        } catch (GithubApiException e) {
            return new ErrorResponse(e.getStatusCode(), e.getMessage());
        }
    }
}
