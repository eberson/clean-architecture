package br.com.clean.architecture.adapters.mapping;

import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.enterprise.Inventory;
import br.com.clean.architecture.enterprise.Product;
import br.com.clean.architecture.enterprise.Quantity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
        imports = {
                Quantity.class
        }
)
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "uuid", source = "dto.id")
    @Mapping(target = "inventory.unity", source = "dto.unity")
    @Mapping(target = "inventory.quantity", expression = "java(Quantity.of(productDTO.getQuantity()))")
    Product toModel(ProductDTO dto);

    @Mapping(target = "quantity", expression = "java(product.inventory().quantity().value())")
    @Mapping(target = "unity", expression = "java(product.inventory().unity())")
    @Mapping(target = "id", expression = "java(product.uuid().toString())")
    @Mapping(target = "name", expression = "java(product.name())")
    ProductDTO toDTO(Product product);

}
