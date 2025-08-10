package list_repositories.entities;

public class GithubCodeOfConduct {
    private String key;
    private String name;
    private String url;
    private String body;
    private String htmlUrl;

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }
}
