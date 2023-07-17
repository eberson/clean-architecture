package br.com.clean.architecture.enterprise;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.util.UUID;

@Getter
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public class Product extends Entity {

    @Serial
    private static final long serialVersionUID = -5238352512965185016L;

    @NotBlank
    private final String name;

    @NotNull
    @Valid
    private final Inventory inventory;

    @Builder(toBuilder = true)
    public Product(@Builder.ObtainVia(method = "uuid") UUID uuid, String name, @NotNull Inventory inventory) {
        super(uuid);
        this.name = name;
        this.inventory = inventory;

        validate();
    }

    public Product add(Inventory inventory) {
        return toBuilder()
                .inventory(inventory().increase(inventory))
                .build();
    }

    public Product withdraw(Inventory inventory) {
        return toBuilder()
                .inventory(inventory().decrease(inventory))
                .build();
    }
}
