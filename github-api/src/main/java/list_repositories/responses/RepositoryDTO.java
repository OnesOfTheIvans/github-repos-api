package list_repositories.responses;

import java.util.Set;

public record RepositoryDTO(String repositoryName, String ownerLogin, Set<BranchDTO> branches) {
}
