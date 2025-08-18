package list_repositories.entities;

import java.time.LocalDateTime;
import java.util.List;

public class GithubApp {
    private Integer id;
    private String slug;
    private String nodeId;
    private String clientId;
    private Ownable owner;
    private String name;
    private String description;
    private String externalUrl;
    private String htmlUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private GithubPermissions permissions;
    private List<String> events;
    private Integer installationsCount;

    public Integer getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getClientId() {
        return clientId;
    }

    public Ownable getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
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

    public List<String> getEvents() {
        return events;
    }

    public Integer getInstallationsCount() {
        return installationsCount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setOwner(Ownable owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
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

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public void setInstallationsCount(Integer installationsCount) {
        this.installationsCount = installationsCount;
    }
}
