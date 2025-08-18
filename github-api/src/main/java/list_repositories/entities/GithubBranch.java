package list_repositories.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubBranch {
    private String name;
    private GithubCommit commit;
    @JsonProperty("protected")
    private String isProtected;
    private GithubProtection protection;
    private String protectionUrl;

    public String getName() {
        return name;
    }

    public GithubCommit getCommit() {
        return commit;
    }

    public String getIsProtected() {
        return isProtected;
    }

    public GithubProtection getProtection() {
        return protection;
    }

    public String getProtectionUrl() {
        return protectionUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommit(GithubCommit commit) {
        this.commit = commit;
    }

    public void setIsProtected(String isProtected) {
        this.isProtected = isProtected;
    }

    public void setProtection(GithubProtection protection) {
        this.protection = protection;
    }

    public void setProtectionUrl(String protectionUrl) {
        this.protectionUrl = protectionUrl;
    }
}
