module clean.challlenge.adapters {
    requires static lombok;
    requires static org.mapstruct;
    requires spring.context;

    requires clean.challlenge.enterprise;
    requires clean.challlenge.common.domain;
    requires clean.challlenge.application;

    exports br.com.clean.architecture.adapters.controller;
    exports br.com.clean.architecture.adapters.controller.factory;
    exports br.com.clean.architecture.adapters.gateway.factory;
    exports br.com.clean.architecture.adapters.presenter.factory;
    exports br.com.clean.architecture.adapters.repository;
    exports br.com.clean.architecture.adapters.mapping;
}