package com.example.social.application.service;

import com.example.social.application.dto.GreetingResponseDto;
import com.example.social.domain.model.User;
import com.example.social.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserGreetingService {

    private final UserRepository userRepository;

    public UserGreetingService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public GreetingResponseDto getFirstUserGreeting() {
        Optional<User> firstUserOptional = userRepository.findFirstUser();

        if (firstUserOptional.isPresent()) {
            User user = firstUserOptional.get();
            String greetingText = "Hi, " + user.getName();

            return new GreetingResponseDto(
                    greetingText,
                    user.getId(),
                    user.getName(),
                    user.getEmail(),
                    LocalDateTime.now(),
                    "Connected to MySQL successfully"
            );
        } else {
            return new GreetingResponseDto(
                    "Hi, Guest! No users found in database.",
                    null,
                    "Guest",
                    null,
                    LocalDateTime.now(),
                    "Connected to MySQL (Table is empty)"
            );
        }
    }
}
