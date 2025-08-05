package com.example.api_gateway.config;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.List;

@Configuration
public class ExampleServiceSupplierConfig {

    @Bean
    public ServiceInstanceListSupplier exampleServiceInstanceSupplier() {
        return new ServiceInstanceListSupplier() {
            @Override
            public String getServiceId() {
                return "example-service";
            }

            @Override
            public Flux<List<ServiceInstance>> get() {
                return Flux.just(List.of(
                        new DefaultServiceInstance(
                                "instance1", "example-service", "localhost", 8081, false),
                        new DefaultServiceInstance(
                                "instance2", "example-service", "localhost", 8082, false)
                ));
            }
        };
    }
}
