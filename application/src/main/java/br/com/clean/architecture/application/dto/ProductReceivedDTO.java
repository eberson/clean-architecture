package br.com.clean.architecture.application.dto;

import br.com.clean.architecture.common.domain.MeasurementUnity;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ProductReceivedDTO extends DTO {
    @Serial
    private static final long serialVersionUID = 8500516380753980330L;

    private String id;
    private String name;

    @NotNull
    private MeasurementUnity unity;

    @Positive
    private int quantity;

    @AssertTrue
    public boolean isValid() {
        return isNotBlank(id) || isNotBlank(name);
    }
}
