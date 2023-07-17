package br.com.clean.architecture.enterprise;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import static jakarta.validation.Validation.buildDefaultValidatorFactory;
import static java.util.Objects.nonNull;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

@Accessors(fluent = true)
@EqualsAndHashCode
@ToString
@Getter
public abstract class Entity implements Serializable, Validatable {
    @Serial
    private static final long serialVersionUID = 1013968269684433583L;

    private final UUID uuid;

    protected Entity(UUID uuid) {
        this.uuid = defaultIfNull(uuid, UUID.randomUUID());
    }
}
