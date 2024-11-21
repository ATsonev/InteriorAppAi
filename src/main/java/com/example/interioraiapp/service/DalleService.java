package com.example.interioraiapp.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DalleService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String generateFurnitureImage(String description) {
        String url = "https://api.openai.com/v1/images/generations";

        // Set up headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer YOUR_API_KEY");
        headers.set("Content-Type", "application/json");

        // Create request body
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("prompt", description);
        requestBody.put("n", 1); // Number of images
        requestBody.put("size", "1024x1024"); // Image size

        // Build the request
        HttpEntity<Map<String, Object>> request = new HttpEntity<>(requestBody, headers);

        ResponseEntity<Map> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                request,
                Map.class
        );

        if (response.getStatusCode().is2xxSuccessful()) {
            Map<String, Object> responseBody = response.getBody();
            if (responseBody != null && responseBody.containsKey("data")) {
                Map<String, Object> firstImage = ((List<Map<String, Object>>) responseBody.get("data")).get(0);
                return (String) firstImage.get("url");
            }
        }

        throw new RuntimeException("Failed to generate image");
    }
}
