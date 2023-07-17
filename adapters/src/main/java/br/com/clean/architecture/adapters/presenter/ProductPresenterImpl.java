package br.com.clean.architecture.adapters.presenter;

import br.com.clean.architecture.adapters.mapping.ProductMapper;
import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.application.presenter.product.ProductPresenter;
import br.com.clean.architecture.enterprise.Product;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductPresenterImpl implements ProductPresenter {

    @Override
    public ProductDTO presentSingle(Product product) {
        return ProductMapper.INSTANCE.toDTO(product);
    }

    @Override
    public List<ProductDTO> presentList(List<Product> products) {
        return products.stream()
                .map(this::presentSingle)
                .toList();
    }
}
