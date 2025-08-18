package list_repositories.entities;

import java.util.List;

public class GithubDismissalRestrictions {
    private List<GithubUser> users;
    private List<GithubTeam> teams;
    private List<GithubApp> apps;
    private String url;
    private String usersUrl;
    private String teamsUrl;

    public List<GithubUser> getUsers() {
        return users;
    }

    public List<GithubTeam> getTeams() {
        return teams;
    }

    public List<GithubApp> getApps() {
        return apps;
    }

    public String getUrl() {
        return url;
    }

    public String getUsersUrl() {
        return usersUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
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
