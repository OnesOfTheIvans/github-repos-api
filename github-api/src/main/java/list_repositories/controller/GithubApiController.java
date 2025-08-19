package list_repositories.controller;

import list_repositories.exceptions.GithubApiException;
import list_repositories.exceptions.UserNotFoundException;
import list_repositories.responses.ErrorResponse;
import list_repositories.responses.UserResponse;
import list_repositories.service.GithubApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/github")
public class GithubApiController {
    private final GithubApiService githubService;

    public GithubApiController(GithubApiService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/repos/{username}")
    public ResponseEntity<?> getUserRepositories(@PathVariable String username) {
        try {
            return ResponseEntity.ok().body(new UserResponse(githubService.getUserRepositories(username)));
        } catch (UserNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage()));
        } catch (GithubApiException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(e.getStatusCode(), e.getMessage()));
        }
    }
}
