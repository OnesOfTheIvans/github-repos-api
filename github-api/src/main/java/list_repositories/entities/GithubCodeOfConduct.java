package list_repositories.entities;

public class GithubCodeOfConduct extends GithubEntityBase {
    private String key;
    private String body;
    private String htmlUrl;

    public String getKey() {
        return key;
    }

    public String getBody() {
        return body;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }
}
