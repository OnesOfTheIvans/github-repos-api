package list_repositories.entities;

public class GithubLicense extends GithubEntityBase {
    private String key;
    private String spdxId;
    private String nodeId;

    public String getKey() {
        return key;
    }

    public String getSpdxId() {
        return spdxId;
    }


    public String getNodeId() {
        return nodeId;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
}
