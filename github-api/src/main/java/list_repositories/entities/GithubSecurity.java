package list_repositories.entities;

public class GithubSecurity {
    private GithubSecurityStatus status;

    public GithubSecurityStatus getStatus() {
        return status;
    }

    public void setStatus(GithubSecurityStatus status) {
        this.status = status;
    }
}
