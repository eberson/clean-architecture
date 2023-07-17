package br.com.clean.architecture.startup.config;

import br.com.clean.architecture.adapters.presenter.factory.PresenterFactory;
import br.com.clean.architecture.application.presenter.product.ProductPresenter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PresenterConfiguration {

    @Bean
    public ProductPresenter productPresenter() {
        return PresenterFactory.productPresenter();
    }

}
