package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SportsService {

    @Value("${cricbuzz.api.url}")
    private String apiUrl;

    @Value("${cricbuzz.api.key}")
    private String apiKey;

    @Value("${cricbuzz.api.host}")
    private String apiHost;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getLiveMatches() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", apiKey);
        headers.set("X-RapidAPI-Host", apiHost);

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                apiUrl,
                HttpMethod.GET,
                entity,
                String.class
        );

        return response.getBody();
    }
}
