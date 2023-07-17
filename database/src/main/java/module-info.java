open module clean.challlenge.database {
    requires static lombok;
    requires static org.mapstruct;
    requires jakarta.validation;
    requires jakarta.persistence;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.boot.autoconfigure;
    requires org.apache.commons.lang3;
    requires spring.context;
    requires org.hibernate.orm.core;

    requires clean.challlenge.adapters;
    requires clean.challlenge.common.domain;
    requires clean.challlenge.application;

    exports br.com.clean.architecture.database.configuration;
    exports br.com.clean.architecture.database.mapping;
}