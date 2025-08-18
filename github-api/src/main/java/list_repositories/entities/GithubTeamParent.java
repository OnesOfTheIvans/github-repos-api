package list_repositories.entities;

public class GithubTeamParent {
    private Integer id;
    private String nodeId;
    private String url;
    private String membersUrl;
    private String name;
    private String description;
    private String permission;
    private String privacy;
    private String notificationSetting;
    private String htmlUrl;
    private String repositoriesUrl;
    private String slug;
    private String ldapDn;

    public Integer getId() {
        return id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getUrl() {
        return url;
    }

    public String getMembersUrl() {
        return membersUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPermission() {
        return permission;
    }

    public String getPrivacy() {
        return privacy;
    }

    public String getNotificationSetting() {
        return notificationSetting;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public String getSlug() {
        return slug;
    }

    public String getLdapDn() {
        return ldapDn;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public void setNotificationSetting(String notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setLdapDn(String ldapDn) {
        this.ldapDn = ldapDn;
    }
}
