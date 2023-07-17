package br.com.clean.architecture.adapters.gateway;

import br.com.clean.architecture.adapters.mapping.ProductMapper;
import br.com.clean.architecture.adapters.repository.ProductRepository;
import br.com.clean.architecture.application.gateway.product.ProductGateway;
import br.com.clean.architecture.enterprise.Product;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ProductGatewayImpl implements ProductGateway {

    private final ProductRepository repository;

    @Override
    public Optional<Product> getById(String id) {
        return repository.findById(id)
                .map(ProductMapper.INSTANCE::toModel);
    }

    @Override
    public Product save(Product product) {
        return ProductMapper.INSTANCE.toModel(
                repository.save(ProductMapper.INSTANCE.toDTO(product))
        );
    }
}
