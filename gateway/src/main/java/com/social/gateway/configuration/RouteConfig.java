package com.social.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class RouteConfig {

    @Bean
    public RouteLocator appRoutes(RouteLocatorBuilder builder, UriConfiguration uriConfiguration)
    {

        return builder.routes()
                .route(p -> p
                        .path("/posts")
                        .filters(f -> f.addRequestHeader("Hello","World"))
                        .uri("http://localhost:8000"))
                .build();
    }
}
