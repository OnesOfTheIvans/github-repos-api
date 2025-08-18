package list_repositories.entities;

public class GithubCommit {
    private String sha;
    private String url;

    public String getUrl() {
        return url;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
