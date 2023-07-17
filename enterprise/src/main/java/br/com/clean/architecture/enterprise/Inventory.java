package br.com.clean.architecture.enterprise;

import br.com.clean.architecture.common.domain.MeasurementUnity;
import br.com.clean.architecture.enterprise.exception.EnterpriseException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;

public record Inventory(@NotNull @Valid Quantity quantity,
                        @NotNull MeasurementUnity unity) implements Serializable, Validatable {
    @Serial
    private static final long serialVersionUID = 2341827474697610040L;

    public Inventory increase(Inventory inventory) {
        inventory.validate();

        if (inventory.unity() != unity()){
            throw new EnterpriseException("operation not allowed: unity is different");
        }

        if (inventory.quantity().hasValueGreaterThanZero()) {
            throw new EnterpriseException("product cannot be increased by zero");
        }

        return new Inventory(
                quantity().increment(inventory.quantity()),
                unity()
        );
    }

    public Inventory decrease(Inventory inventory) {
        inventory.validate();

        if (inventory.unity() != unity()){
            throw new EnterpriseException("operation not allowed: unity is different");
        }

        if (inventory.quantity().hasValueGreaterThanZero()) {
            throw new EnterpriseException("product cannot be decreased by zero");
        }

        if (!quantity().hasValueGreaterThan(inventory.quantity())) {
            throw new EnterpriseException("there are not enough items to be decreased by");
        }

        var newQuantity = quantity().decrement(inventory.quantity());

        return new Inventory(newQuantity, unity());
    }
}
