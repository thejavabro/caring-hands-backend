package io.hackathon.gryffindor.caring_hands.service;

import io.hackathon.gryffindor.caring_hands.entity.User;
import io.hackathon.gryffindor.caring_hands.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

}
