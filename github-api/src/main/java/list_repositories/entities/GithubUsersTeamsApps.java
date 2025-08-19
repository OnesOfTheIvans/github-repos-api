package list_repositories.entities;

import java.util.List;

public class GithubUsersTeamsApps {
    private List<GithubUser> users;
    private List<GithubTeam> teams;
    private List<GithubApp> apps;

    public List<GithubUser> getUsers() {
        return users;
    }

    public List<GithubTeam> getTeams() {
        return teams;
    }

    public List<GithubApp> getApps() {
        return apps;
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
