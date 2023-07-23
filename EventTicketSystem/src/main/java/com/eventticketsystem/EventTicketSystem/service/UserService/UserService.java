package com.eventticketsystem.EventTicketSystem.service.UserService;

import com.eventticketsystem.EventTicketSystem.domain.Entity.User;
import com.eventticketsystem.EventTicketSystem.repository.UserRepository.UserRepositoryInterface;
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
