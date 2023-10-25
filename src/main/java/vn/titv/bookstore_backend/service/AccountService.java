package vn.titv.bookstore_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import vn.titv.bookstore_backend.dao.UserRepository;
import vn.titv.bookstore_backend.entity.Notification;
import vn.titv.bookstore_backend.entity.User;

@Service
public class AccountService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<?> registerAccount(User user) {
        // Check user exists
        if(userRepository.existsByUserName(user.getUserName())){
            return ResponseEntity.badRequest().body(new Notification("User name is exists!"));
        }
        if(userRepository.existsByEmail(user.getEmail())){
            return ResponseEntity.badRequest().body(new Notification("Email is exists!"));
        }

        // Save to database
        User user_registed = userRepository.save(user);

        return ResponseEntity.ok("Register is success");
    }
}
