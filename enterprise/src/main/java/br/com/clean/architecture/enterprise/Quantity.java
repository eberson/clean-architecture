package br.com.clean.architecture.enterprise;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Accessors(fluent = true)
@ToString
public class Quantity implements Serializable, Validatable {
    @Serial
    private static final long serialVersionUID = 5676097435219158623L;

    private static final int MINIMUM_INCREMENT_VALUE = 1;
    private static final int MINIMUM_DECREMENT_VALUE = 1;
    private static final int MINIMUM_VALUE = 0;

    @Min(0)
    @Max(Integer.MAX_VALUE)
    private final int value;

    private Quantity(int value) {
        this.value = value;

        validate();
    }

    public Quantity increment(){
        return increment(MINIMUM_INCREMENT_VALUE);
    }

    public Quantity increment(int value){
        return of(value() + value);
    }

    public Quantity increment(Quantity quantity) {
        return increment(quantity.value());
    }

    public Quantity decrement(){
        return decrement(MINIMUM_DECREMENT_VALUE);
    }

    public Quantity decrement(int value){
        return of(value() - value);
    }

    public Quantity decrement(Quantity quantity) {
        return decrement(quantity.value());
    }

    public boolean hasValueGreaterThanZero() {
        return hasValueGreaterThan(MINIMUM_VALUE);
    }

    public boolean hasValueGreaterThan(int value) {
        return value() > value;
    }

    public boolean hasValueGreaterThan(Quantity quantity) {
        return hasValueGreaterThan(quantity.value());
    }

    public static Quantity of(int value){
        return new Quantity(value);
    }

    public static Quantity min(){
        return Quantity.of(MINIMUM_VALUE);
    }
}