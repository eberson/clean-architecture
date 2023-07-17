open module clean.challlenge.api {
    requires static lombok;

    requires spring.context;
    requires spring.web;
    requires jakarta.validation;

    requires clean.challlenge.adapters;
    requires clean.challlenge.common.domain;
    requires clean.challlenge.application;

    exports br.com.clean.architecture.api.config;
}