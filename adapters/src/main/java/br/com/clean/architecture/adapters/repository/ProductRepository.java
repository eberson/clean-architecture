package br.com.clean.architecture.adapters.repository;

import br.com.clean.architecture.application.dto.ProductDTO;

import java.util.Optional;

public interface ProductRepository {

    Optional<ProductDTO> findById(String id);

    ProductDTO save(ProductDTO product);

}
