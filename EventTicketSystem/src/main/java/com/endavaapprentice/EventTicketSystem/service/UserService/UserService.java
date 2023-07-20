package com.endavaapprentice.EventTicketSystem.service.UserService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.User;
import com.endavaapprentice.EventTicketSystem.repository.UserRepository.UserRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.Collection;

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
}
