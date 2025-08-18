package list_repositories.entities;

public class GithubSignatures {
    private String url;
    private Boolean enabled;

    public String getUrl() {
        return url;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
