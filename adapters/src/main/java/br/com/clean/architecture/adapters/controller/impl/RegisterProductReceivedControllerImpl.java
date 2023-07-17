package br.com.clean.architecture.adapters.controller.impl;

import br.com.clean.architecture.adapters.controller.RegisterProductReceivedController;
import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.application.dto.ProductReceivedDTO;
import br.com.clean.architecture.application.usecase.product.RegisterProductReceivedUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RegisterProductReceivedControllerImpl implements RegisterProductReceivedController {

    private final RegisterProductReceivedUseCase registerProductReceivedUseCase;

    @Override
    public List<ProductDTO> register(List<ProductReceivedDTO> productsReceived) {
        return registerProductReceivedUseCase.register(productsReceived);
    }
}
