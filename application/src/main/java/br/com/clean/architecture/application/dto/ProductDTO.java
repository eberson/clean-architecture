package br.com.clean.architecture.application.dto;

import br.com.clean.architecture.common.domain.MeasurementUnity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ProductDTO extends DTO {
    @Serial
    private static final long serialVersionUID = 8500516380753980330L;

    private String id;
    private String name;
    private MeasurementUnity unity;
    private int quantity;
}
