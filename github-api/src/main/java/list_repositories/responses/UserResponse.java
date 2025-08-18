package list_repositories.responses;

import java.util.List;

public record UserResponse (List<RepositoryDTO> repositories) implements Response {
}