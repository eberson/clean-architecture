package br.com.clean.architecture.enterprise.util;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Set;

import static jakarta.validation.Validation.buildDefaultValidatorFactory;
import static java.util.Objects.nonNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Validations {

    public static void validate(Object object){
        var violations = runValidation(object);

        if (nonNull(violations) && !violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
    }

    public static boolean isValid(Object object){
        return runValidation(object).isEmpty();
    }

    private static Set<ConstraintViolation<Object>> runValidation(Object object){
        try (var factory = buildDefaultValidatorFactory()) {
            var validator = factory.getValidator();

            return validator.validate(object);
        }
    }
}
