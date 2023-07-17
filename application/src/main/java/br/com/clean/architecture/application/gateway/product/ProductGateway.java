package br.com.clean.architecture.application.gateway.product;

import br.com.clean.architecture.enterprise.Product;

import java.util.Optional;

public interface ProductGateway {

    Optional<Product> getById(String id);

    Product save(Product product);

}
