package br.com.clean.architecture.startup.config;

import br.com.clean.architecture.adapters.gateway.factory.GatewayFactory;
import br.com.clean.architecture.adapters.repository.ProductRepository;
import br.com.clean.architecture.application.gateway.product.ProductGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public ProductGateway productGateway(ProductRepository repository) {
        return GatewayFactory.productGateway(repository);
    }

}
