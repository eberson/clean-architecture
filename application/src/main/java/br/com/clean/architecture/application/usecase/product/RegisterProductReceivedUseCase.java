package br.com.clean.architecture.application.usecase.product;

import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.application.dto.ProductReceivedDTO;

import java.util.List;

public interface RegisterProductReceivedUseCase {
    List<ProductDTO> register(List<ProductReceivedDTO> products);
}
