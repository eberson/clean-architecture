package br.com.clean.architecture.adapters.presenter.factory;

import br.com.clean.architecture.adapters.presenter.ProductPresenterImpl;
import br.com.clean.architecture.application.presenter.product.ProductPresenter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PresenterFactory {

    public static ProductPresenter productPresenter() {
        return new ProductPresenterImpl();
    }

}
