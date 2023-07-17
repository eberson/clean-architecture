package br.com.clean.architecture.database.mapping;

import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.database.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface ProductDTOMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "uuid", source = "dto.id")
    @Mapping(target = "created", ignore = true)
    @Mapping(target = "lastUpdated", ignore = true)
    @Mapping(target = "version", ignore = true)
    ProductEntity toEntity(ProductDTO dto);

    @Mapping(target = "id", source = "entity.uuid")
    ProductDTO toDTO(ProductEntity entity);

}
