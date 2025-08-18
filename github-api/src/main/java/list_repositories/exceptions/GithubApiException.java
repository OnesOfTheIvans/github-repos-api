package list_repositories.exceptions;

public class GithubApiException extends RuntimeException {
    private final int statusCode;

    public GithubApiException(String message, Throwable cause, int statusCode) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}