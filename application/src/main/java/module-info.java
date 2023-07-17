module clean.challlenge.application {
    requires static lombok;
    requires org.apache.commons.lang3;
    requires jakarta.validation;
    requires clean.challlenge.enterprise;
    requires clean.challlenge.common.domain;

    exports br.com.clean.architecture.application.dto;

    exports br.com.clean.architecture.application.presenter.product to clean.challlenge.adapters, clean.challlenge.startup;

    exports br.com.clean.architecture.application.gateway.product to clean.challlenge.adapters, clean.challlenge.startup;

    exports br.com.clean.architecture.application.usecase.product to clean.challlenge.adapters, clean.challlenge.startup;
    exports br.com.clean.architecture.application.usecase.product.factory to clean.challlenge.startup;

}