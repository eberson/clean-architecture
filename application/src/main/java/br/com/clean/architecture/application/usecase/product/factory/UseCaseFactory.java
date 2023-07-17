package br.com.clean.architecture.application.usecase.product.factory;

import br.com.clean.architecture.application.gateway.product.ProductGateway;
import br.com.clean.architecture.application.presenter.product.ProductPresenter;
import br.com.clean.architecture.application.usecase.product.RegisterProductReceivedUseCase;
import br.com.clean.architecture.application.usecase.product.impl.RegisterProductReceivedUseCaseImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UseCaseFactory {

    public static RegisterProductReceivedUseCase registerProductReceived(ProductGateway gateway, ProductPresenter presenter){
        return new RegisterProductReceivedUseCaseImpl(gateway, presenter);
    }

}
