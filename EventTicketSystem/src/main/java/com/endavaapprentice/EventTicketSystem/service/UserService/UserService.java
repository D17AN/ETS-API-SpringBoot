package com.endavaapprentice.EventTicketSystem.service.UserService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.domain.DTO.UserDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.Order;
import com.endavaapprentice.EventTicketSystem.domain.Entity.User;
import com.endavaapprentice.EventTicketSystem.repository.UserRepository.UserRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface{

        private UserRepositoryInterface userRepository;

        public UserService(UserRepositoryInterface userRepository){
            this.userRepository = userRepository;
        }

        @Override
        public List<User> getAllUsers(){
            return this.userRepository.findAll();
        }

        @Override
        public User getUserByID(Long userID){
            return this.userRepository.findById(userID).get();
        }
}
