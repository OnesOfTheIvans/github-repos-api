package list_repositories.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GithubEnabled {
    private String url;
    private Boolean enabled;

    public GithubEnabled() {}

    public GithubEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getUrl() {
        return url;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
