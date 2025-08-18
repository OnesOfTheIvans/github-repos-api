package list_repositories.entities;

public class GithubEnabled {
    private Boolean enabled;

    public GithubEnabled() {}

    public GithubEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
