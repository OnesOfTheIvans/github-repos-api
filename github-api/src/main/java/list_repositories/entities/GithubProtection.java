package list_repositories.entities;

public class GithubProtection {
    private String url;
    private Boolean enabled;
    private GithubRequiredStatusChecks requiredStatusChecks;
    private GithubEnforceAdmins enforceAdmins;
    private GithubRequiredPullRequestReviews requiredPullRequestReviews;
    private GithubRestrictions restrictions;
    private GithubEnabled requiredLinearHistory;
    private GithubEnabled allowForcePushes;
    private GithubEnabled allowDeletions;
    private GithubEnabled blockCreations;
    private GithubEnabled requiredConversationResolution;
    private String name;
    private String protectionUrl;
    private GithubSignatures requiredSignatures;
    private GithubEnabled lockBranch = new GithubEnabled(false);
    private GithubEnabled allowForkSyncing = new GithubEnabled(false);

    public String getUrl() {
        return url;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public GithubRequiredStatusChecks getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public GithubEnforceAdmins getEnforceAdmins() {
        return enforceAdmins;
    }

    public GithubRequiredPullRequestReviews getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    public GithubRestrictions getRestrictions() {
        return restrictions;
    }

    public GithubEnabled getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    public GithubEnabled getAllowForcePushes() {
        return allowForcePushes;
    }

    public GithubEnabled getAllowDeletions() {
        return allowDeletions;
    }

    public GithubEnabled getBlockCreations() {
        return blockCreations;
    }

    public GithubEnabled getRequiredConversationResolution() {
        return requiredConversationResolution;
    }

    public String getName() {
        return name;
    }

    public String getProtectionUrl() {
        return protectionUrl;
    }

    public GithubSignatures getRequiredSignatures() {
        return requiredSignatures;
    }

    public GithubEnabled getLockBranch() {
        return lockBranch;
    }

    public GithubEnabled getAllowForkSyncing() {
        return allowForkSyncing;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setRequiredStatusChecks(GithubRequiredStatusChecks requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public void setEnforceAdmins(GithubEnforceAdmins enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    public void setRequiredPullRequestReviews(GithubRequiredPullRequestReviews requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    public void setRestrictions(GithubRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    public void setRequiredLinearHistory(GithubEnabled requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    public void setAllowForcePushes(GithubEnabled allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    public void setAllowDeletions(GithubEnabled allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    public void setBlockCreations(GithubEnabled blockCreations) {
        this.blockCreations = blockCreations;
    }

    public void setRequiredConversationResolution(GithubEnabled requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProtectionUrl(String protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    public void setRequiredSignatures(GithubSignatures requiredSignatures) {
        this.requiredSignatures = requiredSignatures;
    }

    public void setLockBranch(GithubEnabled lockBranch) {
        this.lockBranch = lockBranch;
    }

    public void setAllowForkSyncing(GithubEnabled allowForkSyncing) {
        this.allowForkSyncing = allowForkSyncing;
    }
}
