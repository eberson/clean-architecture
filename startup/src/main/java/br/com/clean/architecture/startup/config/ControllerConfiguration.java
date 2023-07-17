package br.com.clean.architecture.startup.config;

import br.com.clean.architecture.adapters.controller.RegisterProductReceivedController;
import br.com.clean.architecture.adapters.controller.factory.ControllerFactory;
import br.com.clean.architecture.application.usecase.product.RegisterProductReceivedUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfiguration {

    @Bean
    public RegisterProductReceivedController registerProductReceivedController(RegisterProductReceivedUseCase usecase) {
        return ControllerFactory.registerProductReceivedController(usecase);
    }

}
