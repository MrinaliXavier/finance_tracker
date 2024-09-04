package com.example.personalFinanceTracker.service;

import com.example.personalFinanceTracker.Repo.UserRepository;
import com.example.personalFinanceTracker.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Long addUser(User user) {
        return userRepository.save(user).getId();
    }
}
//package com.example.personalFinanceTracker.service;
//
//import com.example.personalFinanceTracker.Repo.UserRepository;
//import com.example.personalFinanceTracker.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;  // Add this if you're using Spring Security
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;  // Add this if you're using Spring Security
//
//    public Long addUser(User user) {
//        // Hash the password before saving the user
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.save(user).getId();
//    }
//
//    // Find a user by email
//    public User findByEmail(String email) {
//        Optional<User> userOptional = userRepository.findByEmail(email);
//        return userOptional.orElse(null);
//    }
//
//    // Check if the provided password matches the stored password
//    public boolean checkPassword(String rawPassword, String encodedPassword) {
//        return passwordEncoder.matches(rawPassword, encodedPassword);
//    }
//}
