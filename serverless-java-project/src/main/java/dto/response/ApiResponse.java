package dto.response;
import java.util.Map;

public class ApiResponse {
	private int statusCode;
	private Map<String, String> headers;
	private String body;

	public ApiResponse(int statusCode, String body) {
		this.statusCode = statusCode;
		this.body = body;
		this.headers = Map.of(
				"Content-Type", "application/json",
				"Access-Control-Allow-Origin", "*"
		);
	}

	public int getStatusCode() {
		return statusCode;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public String getBody() {
		return body;
	}
}

