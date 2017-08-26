package jsug.portside;

import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "jsug")
@Component
public class JsugProps {
	private Set<String> adminUsers;
	private String apiUrl;

	public Set<String> getAdminUsers() {
		return adminUsers;
	}

	public void setAdminUsers(Set<String> adminUsers) {
		this.adminUsers = adminUsers;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
}
