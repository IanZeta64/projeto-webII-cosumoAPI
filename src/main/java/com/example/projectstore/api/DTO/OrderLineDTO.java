package com.example.projectstore.api.DTO;
import lombok.*;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderLineDTO {
    private Long productDTOId;
    private int amount;
    private String CurrencyCode;
    private BigDecimal finalPrice;
}
