package com.endavaapprentice.EventTicketSystem.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String userName;
    private String userEmail;
    private List<OrderDTO> ordersList;
}


