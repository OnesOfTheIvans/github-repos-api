package list_repositories.entities;

public class GithubRequiredPullRequestReviews {
    private String url;
    private GithubDismissalRestrictions dismissalRestrictions;
    private GithubBypassPullRequestAllowances bypassPullRequestAllowances;
    private Boolean dismissStaleReviews;
    private Boolean requireCodeOwnerReviews;
    private Integer requiredApprovingReviewCount;
    private Boolean requireLastPushApproval;

    public String getUrl() {
        return url;
    }

    public GithubDismissalRestrictions getDismissalRestrictions() {
        return dismissalRestrictions;
    }

    public GithubBypassPullRequestAllowances getBypassPullRequestAllowances() {
        return bypassPullRequestAllowances;
    }

    public Boolean getDismissStaleReviews() {
        return dismissStaleReviews;
    }

    public Boolean getRequireCodeOwnerReviews() {
        return requireCodeOwnerReviews;
    }

    public Integer getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public Boolean getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDismissalRestrictions(GithubDismissalRestrictions dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
    }

    public void setBypassPullRequestAllowances(GithubBypassPullRequestAllowances bypassPullRequestAllowances) {
        this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    }

    public void setDismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }
}
