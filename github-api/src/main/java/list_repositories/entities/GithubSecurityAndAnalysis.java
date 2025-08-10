package list_repositories.entities;

public class GithubSecurityAndAnalysis {
    private GithubSecurity advancedSecurity;
    private GithubSecurity codeSecurity;
    private GithubSecurity dependabotSecurityUpdates;
    private GithubSecurity secretScanning;
    private GithubSecurity secretScanningPushProtection;
    private GithubSecurity secretScanningNonProviderPatterns;
    private GithubSecurity secretScanningAiDetection;

    public GithubSecurity getAdvancedSecurity() {
        return advancedSecurity;
    }

    public GithubSecurity getCodeSecurity() {
        return codeSecurity;
    }

    public GithubSecurity getDependabotSecurityUpdates() {
        return dependabotSecurityUpdates;
    }

    public GithubSecurity getSecretScanning() {
        return secretScanning;
    }

    public GithubSecurity getSecretScanningPushProtection() {
        return secretScanningPushProtection;
    }

    public GithubSecurity getSecretScanningNonProviderPatterns() {
        return secretScanningNonProviderPatterns;
    }

    public GithubSecurity getSecretScanningAiDetection() {
        return secretScanningAiDetection;
    }

    public void setAdvancedSecurity(GithubSecurity advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
    }

    public void setCodeSecurity(GithubSecurity codeSecurity) {
        this.codeSecurity = codeSecurity;
    }

    public void setDependabotSecurityUpdates(GithubSecurity dependabotSecurityUpdates) {
        this.dependabotSecurityUpdates = dependabotSecurityUpdates;
    }

    public void setSecretScanning(GithubSecurity secretScanning) {
        this.secretScanning = secretScanning;
    }

    public void setSecretScanningPushProtection(GithubSecurity secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
    }

    public void setSecretScanningNonProviderPatterns(GithubSecurity secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
    }

    public void setSecretScanningAiDetection(GithubSecurity secretScanningAiDetection) {
        this.secretScanningAiDetection = secretScanningAiDetection;
    }
}
