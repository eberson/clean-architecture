open module clean.challlenge.enterprise {
    requires static lombok;
    requires org.apache.commons.lang3;
    requires jakarta.validation;
    requires clean.challlenge.common.domain;

    exports br.com.clean.architecture.enterprise to clean.challlenge.application, clean.challlenge.adapters;
    exports br.com.clean.architecture.enterprise.exception to clean.challlenge.application, clean.challlenge.adapters;
    exports br.com.clean.architecture.enterprise.util to clean.challlenge.application, clean.challlenge.adapters;
}