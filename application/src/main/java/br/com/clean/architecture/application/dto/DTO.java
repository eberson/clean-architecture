package br.com.clean.architecture.application.dto;

import java.io.Serial;
import java.io.Serializable;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;

public abstract class DTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 3571099471574320939L;

    @Override
    public boolean equals(Object obj) {
        return reflectionEquals(this, obj, true);
    }

    @Override
    public int hashCode() {
        return reflectionHashCode(this, true);
    }
}
