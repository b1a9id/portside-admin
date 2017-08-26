package jsug.portside.session;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import jsug.portside.JsugProps;

@Repository
public class SessionRepository {
	private final RestTemplate restTemplate;
	private final JsugProps props;

	public SessionRepository(RestTemplate restTemplate, JsugProps props) {
		this.restTemplate = restTemplate;
		this.props = props;
	}

	public List<Session> findAll() {
		return Arrays.asList(restTemplate.getForObject("{apiUrl}/sessions",
				Session[].class, props.getApiUrl()));
	}

	public Session save(Session session) {
		restTemplate.postForObject("{apiUrl}/sessions", session, Void.class,
				props.getApiUrl());
		return session;
	}
}