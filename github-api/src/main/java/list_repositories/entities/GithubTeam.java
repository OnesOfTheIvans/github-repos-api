package list_repositories.entities;

public class GithubTeam {
    private Integer id;
    private String nodeId;
    private String name;
    private String slug;
    private String description;
    private String privacy;
    private String notificationSetting;
    private String permission;
    private GithubPermissions permissions;
    private String url;
    private String htmlUrl;
    private String membersUrl;
    private String repositoriesUrl;
    private GithubTeamParent parent;

    public Integer getId() {
        return id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getDescription() {
        return description;
    }

    public String getPrivacy() {
        return privacy;
    }

    public String getNotificationSetting() {
        return notificationSetting;
    }

    public String getPermission() {
        return permission;
    }

    public GithubPermissions getPermissions() {
        return permissions;
    }

    public String getUrl() {
        return url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getMembersUrl() {
        return membersUrl;
    }

    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public GithubTeamParent getParent() {
        return parent;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public void setNotificationSetting(String notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setPermissions(GithubPermissions permissions) {
        this.permissions = permissions;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public void setParent(GithubTeamParent parent) {
        this.parent = parent;
    }
}
