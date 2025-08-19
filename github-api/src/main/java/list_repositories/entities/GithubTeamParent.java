package list_repositories.entities;

public class GithubTeamParent extends GithubTeamBase {
    private String ldapDn;

    public String getLdapDn() {
        return ldapDn;
    }

    public void setLdapDn(String ldapDn) {
        this.ldapDn = ldapDn;
    }
}
