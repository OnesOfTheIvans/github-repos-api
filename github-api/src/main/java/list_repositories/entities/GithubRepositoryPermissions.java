package list_repositories.entities;

public class GithubRepositoryPermissions {
    private Boolean admin;
    private Boolean maintain;
    private Boolean push;
    private Boolean triage;
    private Boolean pull;

    public Boolean getAdmin() {
        return admin;
    }

    public Boolean getMaintain() {
        return maintain;
    }

    public Boolean getPush() {
        return push;
    }

    public Boolean getTriage() {
        return triage;
    }

    public Boolean getPull() {
        return pull;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public void setMaintain(Boolean maintain) {
        this.maintain = maintain;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public void setTriage(Boolean triage) {
        this.triage = triage;
    }

    public void setPull(Boolean pull) {
        this.pull = pull;
    }
}
