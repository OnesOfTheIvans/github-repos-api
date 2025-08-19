package list_repositories.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class GithubRepository extends GithubEntityBase {
    private Integer id;
    private String nodeId;
    private String fullName;
    private GithubUser owner;
    @JsonProperty("private")
    private Boolean isPrivate;
    private String htmlUrl;
    private String description;
    private Boolean fork;
    private String archiveUrl;
    private String assigneesUrl;
    private String blobsUrl;
    private String branchesUrl;
    private String collaboratorsUrl;
    private String commentsUrl;
    private String commitsUrl;
    private String compareUrl;
    private String contentsUrl;
    private String contributorsUrl;
    private String deploymentsUrl;
    private String downloadsUrl;
    private String eventsUrl;
    private String forksUrl;
    private String gitCommitsUrl;
    private String gitRefsUrl;
    private String gitTagsUrl;
    private String gitUrl;
    private String issueCommentUrl;
    private String issueEventsUrl;
    private String issuesUrl;
    private String keysUrl;
    private String labelsUrl;
    private String languagesUrl;
    private String mergesUrl;
    private String milestonesUrl;
    private String notificationsUrl;
    private String pullsUrl;
    private String releasesUrl;
    private String sshUrl;
    private String stargazersUrl;
    private String statusesUrl;
    private String subscribersUrl;
    private String subscriptionUrl;
    private String tagsUrl;
    private String teamsUrl;
    private String treesUrl;
    private String cloneUrl;
    private String mirrorUrl;
    private String hooksUrl;
    private String svnUrl;
    private String homepage;
    private String language;
    private Integer forksCount;
    private Integer stargazersCount;
    private Integer watchersCount;
    private Integer size;
    private String defaultBranch;
    private Integer openIssuesCount;
    private Boolean isTemplate;
    private List<String> topics;
    private Boolean hasIssues;
    private Boolean hasProjects;
    private Boolean hasWiki;
    private Boolean hasPages;
    private Boolean hasDownloads;
    private Boolean archived;
    private Boolean disabled;
    private String visibility;
    private LocalDateTime pushedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private GithubPermissions permissions;
    private String roleName;
    private String tempCloneToken;
    private Boolean deleteBranchOnMerge;
    private Integer subscribersCount;
    private Integer networkCount;
    private GithubCodeOfConduct codeOfConduct;
    private Integer forks;
    private Integer openIssues;
    private Integer watchers;
    private Boolean allowForking;
    private Boolean webCommitSignoffRequired;
    private GithubSecurityAndAnalysis securityAndAnalysis;

    public Integer getId() {
        return id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getFullName() {
        return fullName;
    }

    public GithubUser getOwner() {
        return owner;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public Boolean isFork() {
        return fork;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getLanguage() {
        return language;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public Integer getSize() {
        return size;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public Boolean getTemplate() {
        return isTemplate;
    }

    public List<String> getTopics() {
        return topics;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public Boolean getArchived() {
        return archived;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public String getVisibility() {
        return visibility;
    }

    public LocalDateTime getPushedAt() {
        return pushedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public GithubPermissions getPermissions() {
        return permissions;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getTempCloneToken() {
        return tempCloneToken;
    }

    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public Integer getSubscribersCount() {
        return subscribersCount;
    }

    public Integer getNetworkCount() {
        return networkCount;
    }

    public GithubCodeOfConduct getCodeOfConduct() {
        return codeOfConduct;
    }

    public Integer getForks() {
        return forks;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public Boolean getAllowForking() {
        return allowForking;
    }

    public Boolean getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public GithubSecurityAndAnalysis getSecurityAndAnalysis() {
        return securityAndAnalysis;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setOwner(GithubUser owner) {
        this.owner = owner;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public void setTemplate(Boolean template) {
        isTemplate = template;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setPushedAt(LocalDateTime pushedAt) {
        this.pushedAt = pushedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPermissions(GithubPermissions permissions) {
        this.permissions = permissions;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setTempCloneToken(String tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public void setSubscribersCount(Integer subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public void setNetworkCount(Integer networkCount) {
        this.networkCount = networkCount;
    }

    public void setCodeOfConduct(GithubCodeOfConduct codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public void setAllowForking(Boolean allowForking) {
        this.allowForking = allowForking;
    }

    public void setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    public void setSecurityAndAnalysis(GithubSecurityAndAnalysis securityAndAnalysis) {
        this.securityAndAnalysis = securityAndAnalysis;
    }
}
