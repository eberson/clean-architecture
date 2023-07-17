package br.com.clean.architecture.database.entity;

import br.com.clean.architecture.common.domain.MeasurementUnity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;

@Getter
@Setter
@ToString
@Entity
@Table(name = "product")
public class ProductEntity extends JPAEntity {
    @Serial
    private static final long serialVersionUID = -4414317323401350326L;

    private String name;

    @Enumerated(EnumType.STRING)
    private MeasurementUnity unity;

    private Integer quantity;
}
