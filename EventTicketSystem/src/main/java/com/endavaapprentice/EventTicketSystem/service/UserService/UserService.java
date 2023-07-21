package com.endavaapprentice.EventTicketSystem.service.UserService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.domain.DTO.TicketCategoryDTO;
import com.endavaapprentice.EventTicketSystem.domain.DTO.UserDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.Order;
import com.endavaapprentice.EventTicketSystem.domain.Entity.TicketCategory;
import com.endavaapprentice.EventTicketSystem.domain.Entity.User;
import com.endavaapprentice.EventTicketSystem.repository.UserRepository.UserRepositoryInterface;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService implements UserServiceInterface{

        private UserRepositoryInterface userRepository;

        public UserService(UserRepositoryInterface userRepository){
            this.userRepository = userRepository;
        }

        @Override
        public Collection<User> getAllUser(){
            return this.userRepository.findAll();
        }

        @Override
        public User getUserById(Long userId){
            return this.userRepository.findById(userId).get();
        }

        @Override
        public List<OrderDTO> getAllOrdersOfUser(Long userID){
            User user = this.userRepository.findById(userID).get();
            UserDTO userDTO = new UserDTO(
                    user.getUserName(),
                    user.getUserEmail(),
                    user.getOrdersList().stream().map(order -> {
                        return new OrderDTO(order.getTicketCategory().getEvent().getEventID(),
                                order.getOrderedAt(),
                                order.getTicketCategory().getTicketCategoryID(),
                                order.getTotalPrice());
                    }).toList());
            return userDTO.getOrdersList();
        }
}
