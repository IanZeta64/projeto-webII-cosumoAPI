package com.example.projectstore.api.models;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class OrderLineDTO {
    private Long productDTOId;
    private int amount;
    private String CurrencyCode;
    private BigDecimal finalPrice;
}
