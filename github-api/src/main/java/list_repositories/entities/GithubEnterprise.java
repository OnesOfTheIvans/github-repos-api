package list_repositories.entities;

import java.time.LocalDateTime;

public class GithubEnterprise extends GithubOwnerBase implements Ownable {
    private String description;
    private String websiteUrl;
    private String slug;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public String getDescription() {
        return description;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getSlug() {
        return slug;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
