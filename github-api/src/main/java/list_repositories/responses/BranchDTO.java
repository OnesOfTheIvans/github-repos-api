package list_repositories.responses;

public record BranchDTO(String name, String sha) {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BranchDTO(String name1, String sha1)) {
            return this.name.equals(name1) && this.sha.equals(sha1);
        }
        return false;
    }
}
