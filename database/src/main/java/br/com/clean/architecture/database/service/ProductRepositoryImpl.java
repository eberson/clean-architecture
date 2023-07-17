package br.com.clean.architecture.database.service;

import br.com.clean.architecture.adapters.repository.ProductRepository;
import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.database.mapping.ProductDTOMapper;
import br.com.clean.architecture.database.repository.ProductEntityRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductEntityRepository repository;
    private final ProductDTOMapper mapper;

    @Override
    public Optional<ProductDTO> findById(String id) {
        return repository.findByUuid(id)
                .map(mapper::toDTO);
    }

    @Override
    public ProductDTO save(ProductDTO product) {
        return mapper.toDTO(repository.save(mapper.toEntity(product)));
    }
}
