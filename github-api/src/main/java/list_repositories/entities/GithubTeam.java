package list_repositories.entities;

public class GithubTeam extends GithubTeamBase {
    private GithubPermissions permissions;
    private GithubTeamParent parent;

    public GithubPermissions getPermissions() {
        return permissions;
    }

    public GithubTeamParent getParent() {
        return parent;
    }

    public void setPermissions(GithubPermissions permissions) {
        this.permissions = permissions;
    }

    public void setParent(GithubTeamParent parent) {
        this.parent = parent;
    }
}
