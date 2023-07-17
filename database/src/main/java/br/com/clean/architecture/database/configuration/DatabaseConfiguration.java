package br.com.clean.architecture.database.configuration;

import br.com.clean.architecture.adapters.repository.ProductRepository;
import br.com.clean.architecture.database.mapping.ProductDTOMapper;
import br.com.clean.architecture.database.repository.ProductEntityRepository;
import br.com.clean.architecture.database.service.ProductRepositoryImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories("br.com.clean.architecture.database.repository")
@EntityScan("br.com.clean.architecture.database.entity")
@ComponentScan("br.com.clean.architecture.database")
public class DatabaseConfiguration {

    @Bean
    public ProductRepository productRepository(ProductEntityRepository repository, ProductDTOMapper mapper) {
        return new ProductRepositoryImpl(repository, mapper);
    }
}
