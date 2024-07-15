package com.example.literalura.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class GutendexService {
    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<String> getBooks(String query) {
        WebClient webClient = webClientBuilder.baseUrl("https://gutendex.com/").build();
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/books")
                        .queryParam("search", query)
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }
}
