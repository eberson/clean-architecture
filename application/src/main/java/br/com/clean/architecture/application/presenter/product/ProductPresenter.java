package br.com.clean.architecture.application.presenter.product;

import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.enterprise.Product;

import java.util.List;

public interface ProductPresenter {

    ProductDTO presentSingle(Product product);

    List<ProductDTO> presentList(List<Product> products);

}
