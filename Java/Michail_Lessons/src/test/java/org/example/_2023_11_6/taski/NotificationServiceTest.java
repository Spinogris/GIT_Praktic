package org.example._2023_11_6.taski;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NotificationServiceTest {

    @Mock
    User user;
    String subject;
    String message;
    EmailService emailService;

    @Test
    void notifyUserTrueTest() {
    }
}