package list_repositories.responses;

public record ErrorResponse (Integer status, String message) implements Response {
}
