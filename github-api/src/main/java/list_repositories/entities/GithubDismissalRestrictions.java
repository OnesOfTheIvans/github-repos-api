package list_repositories.entities;

public class GithubDismissalRestrictions extends GithubUsersTeamsApps{
    private String url;
    private String usersUrl;
    private String teamsUrl;

    public String getUrl() {
        return url;
    }

    public String getUsersUrl() {
        return usersUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsersUrl(String usersUrl) {
        this.usersUrl = usersUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }
}
