package list_repositories.entities;

public enum GithubSecurityStatus {
    ENABLED("enabled"),
    DISABLED("disabled");

    private final String value;

    GithubSecurityStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
