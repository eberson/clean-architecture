package br.com.clean.architecture.adapters.gateway.factory;

import br.com.clean.architecture.adapters.gateway.ProductGatewayImpl;
import br.com.clean.architecture.adapters.repository.ProductRepository;
import br.com.clean.architecture.application.gateway.product.ProductGateway;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GatewayFactory {
    public static ProductGateway productGateway(ProductRepository repository) {
        return new ProductGatewayImpl(repository);
    }
}
