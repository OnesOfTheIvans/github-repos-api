package list_repositories.entities;

import java.util.List;

public class GithubRestrictions {
    private String url;
    private String usersUrl;
    private String teamsUrl;
    private String appsUrl;
    private List<GithubUser> users;
    private List<GithubTeam> teams;
    private List<GithubApp> apps;

    public String getUrl() {
        return url;
    }

    public String getUsersUrl() {
        return usersUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public String getAppsUrl() {
        return appsUrl;
    }

    public List<GithubUser> getUsers() {
        return users;
    }

    public List<GithubTeam> getTeams() {
        return teams;
    }

    public List<GithubApp> getApps() {
        return apps;
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

    public void setAppsUrl(String appsUrl) {
        this.appsUrl = appsUrl;
    }

    public void setUsers(List<GithubUser> users) {
        this.users = users;
    }

    public void setTeams(List<GithubTeam> teams) {
        this.teams = teams;
    }

    public void setApps(List<GithubApp> apps) {
        this.apps = apps;
    }
}
