package com.example.ClimaAPI.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {

    private static final String BASE_URL =
            "https://api.open-meteo.com/v1/forecast";

    private String consultarUrl(String apiUrl) {

        String dados = "";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: "
                    + responseEntity.getStatusCode();
        }

        return dados;
    }

    public String consultarClima() {

        String url = BASE_URL
                + "?latitude=-19.9167"
                + "&longitude=-43.9345"
                + "&current=temperature_2m"
                + ",relative_humidity_2m"
                + ",wind_speed_10m"
                + ",wind_direction_10m"
                + ",weather_code"
                + "&daily=temperature_2m_max"
                + ",temperature_2m_min"
                + "&timezone=auto";

        return consultarUrl(url);
    }
}