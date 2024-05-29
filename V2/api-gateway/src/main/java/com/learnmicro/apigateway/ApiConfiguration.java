package com.learnmicro.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route( p-> p.path("/get")
                        .filters( f-> f.addRequestHeader("MyHeader","MyURI")
                                .addRequestParameter("Param", "MyValue"))
                        .uri("http://httpbin.org:80"))
                .route( p -> p.path("/currency-exchange/**")
                        .uri("lb://CURREMCY-EXCHANGE-SERVICE"))
                .route( p -> p.path("/currency-conversion-feign/**")
                        .uri("lb://CURRENCY-CONVERSION-SERVICE"))
                .route( p -> p.path("/new/**")
                        .filters( f -> f.rewritePath(
                                "/new/(?<segment>.*)",
                                "/currency-conversion/${segment}"
                        ))
                        .uri("lb://CURRENCY-CONVERSION-SERVICE"))
                .build();
    }
}
