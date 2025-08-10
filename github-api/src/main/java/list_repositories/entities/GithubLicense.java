package list_repositories.entities;

public class GithubLicense {
    private String key;
    private String name;
    private String spdxId;
    private String url;
    private String nodeId;

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSpdxId() {
        return spdxId;
    }

    public String getUrl() {
        return url;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
}
