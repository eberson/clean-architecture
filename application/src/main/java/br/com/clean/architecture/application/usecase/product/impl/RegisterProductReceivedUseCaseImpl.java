package br.com.clean.architecture.application.usecase.product.impl;

import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.application.dto.ProductReceivedDTO;
import br.com.clean.architecture.application.gateway.product.ProductGateway;
import br.com.clean.architecture.application.presenter.product.ProductPresenter;
import br.com.clean.architecture.application.usecase.product.RegisterProductReceivedUseCase;
import br.com.clean.architecture.enterprise.Inventory;
import br.com.clean.architecture.enterprise.Product;
import br.com.clean.architecture.enterprise.Quantity;
import br.com.clean.architecture.enterprise.util.Validations;

import java.util.List;

public class RegisterProductReceivedUseCaseImpl implements RegisterProductReceivedUseCase {

    private final ProductGateway gateway;
    private final ProductPresenter presenter;

    public RegisterProductReceivedUseCaseImpl(ProductGateway gateway, ProductPresenter presenter) {
        this.gateway = gateway;
        this.presenter = presenter;
    }

    @Override
    public List<ProductDTO> register(List<ProductReceivedDTO> products) {
        return products.stream()
                .map(this::register)
                .toList();
    }

    private ProductDTO register(ProductReceivedDTO productReceived) {
        var product = gateway.getById(productReceived.getId())
                .map(prod -> updateProductInventory(prod, productReceived))
                .orElseGet(() -> createProduct(productReceived));

        return presenter.presentSingle(gateway.save(product));
    }

    private Product updateProductInventory(Product product, ProductReceivedDTO productReceived) {
        Validations.validate(productReceived);

        var inventory = new Inventory(
                Quantity.of(productReceived.getQuantity()),
                productReceived.getUnity()
        );

        return product.add(inventory);
    }

    private Product createProduct(ProductReceivedDTO productReceived) {
        var inventory = new Inventory(
                Quantity.of(productReceived.getQuantity()),
                productReceived.getUnity()
        );

        return Product.builder()
                .name(productReceived.getName())
                .inventory(inventory)
                .build();
    }
}
