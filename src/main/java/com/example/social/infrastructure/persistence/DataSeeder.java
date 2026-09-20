package com.example.social.infrastructure.persistence;

import com.example.social.domain.model.User;
import com.example.social.domain.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            User firstUser = new User(
                    null,
                    "Alex Morgan",
                    "alex.morgan@example.com",
                    LocalDateTime.now()
            );
            userRepository.save(firstUser);

            User secondUser = new User(
                    null,
                    "Sarah Connor",
                    "sarah.connor@example.com",
                    LocalDateTime.now()
            );
            userRepository.save(secondUser);

            System.out.println("DataSeeder: Seeded initial users into MySQL users table.");
        } else {
            System.out.println("DataSeeder: Users table already populated. Total users: " + userRepository.count());
        }
    }
}
