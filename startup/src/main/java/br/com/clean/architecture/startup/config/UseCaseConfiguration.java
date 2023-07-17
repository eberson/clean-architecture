package br.com.clean.architecture.startup.config;

import br.com.clean.architecture.application.gateway.product.ProductGateway;
import br.com.clean.architecture.application.presenter.product.ProductPresenter;
import br.com.clean.architecture.application.usecase.product.RegisterProductReceivedUseCase;
import br.com.clean.architecture.application.usecase.product.factory.UseCaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public RegisterProductReceivedUseCase registerProductReceivedUseCase(ProductGateway gateway, ProductPresenter presenter) {
        return UseCaseFactory.registerProductReceived(gateway, presenter);
    }

}
