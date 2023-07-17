package br.com.clean.architecture.adapters.controller;

import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.application.dto.ProductReceivedDTO;

import java.util.List;

public interface RegisterProductReceivedController {

    List<ProductDTO> register(List<ProductReceivedDTO> productsReceived);

}
