package list_repositories.entities;

public class GithubCheck {
    private String context;
    private Integer appId;

    public String getContext() {
        return context;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}
