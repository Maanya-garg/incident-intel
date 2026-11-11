package com.incidentintel.backend.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void savesAndFindsUserByEmail() {
        User saved = userRepository.save(new User("test-user@example.com", "not-a-real-hash"));

        assertNotNull(saved.getId());

        Optional<User> found = userRepository.findByEmail("test-user@example.com");
        assertTrue(found.isPresent());
        assertEquals("test-user@example.com", found.get().getEmail());
    }

    @Test
    void rejectsDuplicateEmail() {
        userRepository.saveAndFlush(new User("dup@example.com", "hash-1"));

        assertThrows(DataIntegrityViolationException.class,
                () -> userRepository.saveAndFlush(new User("dup@example.com", "hash-2")));
    }
}