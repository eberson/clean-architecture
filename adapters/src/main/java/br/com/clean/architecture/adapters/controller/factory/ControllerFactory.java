package br.com.clean.architecture.adapters.controller.factory;

import br.com.clean.architecture.adapters.controller.RegisterProductReceivedController;
import br.com.clean.architecture.adapters.controller.impl.RegisterProductReceivedControllerImpl;
import br.com.clean.architecture.application.usecase.product.RegisterProductReceivedUseCase;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ControllerFactory {

    public static RegisterProductReceivedController registerProductReceivedController(RegisterProductReceivedUseCase usecase) {
        return new RegisterProductReceivedControllerImpl(usecase);
    }

}
