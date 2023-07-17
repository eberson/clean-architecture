open module clean.challlenge.startup {
    requires static lombok;

    requires spring.web;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    requires spring.boot.starter.web;

    requires clean.challlenge.adapters;
    requires clean.challlenge.application;
    requires clean.challlenge.database;
    requires clean.challlenge.api;

    exports br.com.clean.architecture.startup;
    exports br.com.clean.architecture.startup.config;
}