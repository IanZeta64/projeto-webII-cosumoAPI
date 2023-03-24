package com.example.projectstore.api.DTO;

import com.example.projectstore.api.models.OrderLineDTO;
import com.example.projectstore.api.models.User;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDTO {
    private LocalDateTime localDateTime;
    private User user;

    private Set<OrderLineDTO> orderLineDTOS;

}
