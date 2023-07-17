package br.com.clean.architecture.api.resource;

import br.com.clean.architecture.adapters.controller.RegisterProductReceivedController;
import br.com.clean.architecture.application.dto.ProductDTO;
import br.com.clean.architecture.application.dto.ProductReceivedDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductResource {

    private final RegisterProductReceivedController registerProductReceivedController;

    @PostMapping
    public List<ProductDTO> register(@RequestBody @Valid List<ProductReceivedDTO> request){
        return registerProductReceivedController.register(request);
    }

}
