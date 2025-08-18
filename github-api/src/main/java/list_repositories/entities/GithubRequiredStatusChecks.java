package list_repositories.entities;

import java.util.List;

public class GithubRequiredStatusChecks {
    private String url;
    private String enforcementLevel;
    private List<String> contexts;
    private List<GithubCheck> checks;
    private String contextsUrl;
    private Boolean strict;

    public String getUrl() {
        return url;
    }

    public String getEnforcementLevel() {
        return enforcementLevel;
    }

    public List<String> getContexts() {
        return contexts;
    }

    public List<GithubCheck> getChecks() {
        return checks;
    }

    public String getContextsUrl() {
        return contextsUrl;
    }

    public Boolean getStrict() {
        return strict;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEnforcementLevel(String enforcementLevel) {
        this.enforcementLevel = enforcementLevel;
    }

    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    public void setChecks(List<GithubCheck> checks) {
        this.checks = checks;
    }

    public void setContextsUrl(String contextsUrl) {
        this.contextsUrl = contextsUrl;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }
}
