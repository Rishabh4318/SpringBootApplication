package com.example.bfflayer.client;

import com.example.bfflayer.dto.Product;
import jakarta.websocket.ClientEndpoint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
@Component
public class Deposit{
    private RestTemplate restTemplate;

    public Deposit() {
        this.restTemplate = new RestTemplate();
    }
    @Value("${client.deposit}")
    private String host;
    public ResponseEntity<String> postCall(Product product){
        String url = host +"/operation/save";
        // headers.add("HeaderName", "HeaderValue");
        System.out.println(url);
        HttpEntity<Product> requestEntity = new HttpEntity<>(product);
        return restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
    }
}
