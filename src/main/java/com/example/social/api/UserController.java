package com.example.social.api;

import com.example.social.application.dto.GreetingResponseDto;
import com.example.social.application.service.UserGreetingService;
import com.example.social.domain.model.User;
import com.example.social.domain.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserGreetingService userGreetingService;
    private final UserRepository userRepository;

    public UserController(UserGreetingService userGreetingService, UserRepository userRepository) {
        this.userGreetingService = userGreetingService;
        this.userRepository = userRepository;
    }

    /**
     * Test API returning "Hi, [first user name]" along with metadata from MySQL.
     */
    @GetMapping("/greeting")
    public ResponseEntity<GreetingResponseDto> getGreeting() {
        GreetingResponseDto greeting = userGreetingService.getFirstUserGreeting();
        return ResponseEntity.ok(greeting);
    }

    /**
     * Optional endpoint to list all users from MySQL.
     */
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }
}
