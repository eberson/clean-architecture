package br.com.clean.architecture.enterprise;

import br.com.clean.architecture.enterprise.util.Validations;
import jakarta.validation.ConstraintViolationException;

import static java.util.Objects.nonNull;

public interface Validatable {
    default void validate(){
        Validations.validate(this);
    }

    default boolean isValid(){
        return Validations.isValid(this);
    }
}
