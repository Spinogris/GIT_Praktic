package org.example._2023_12_06.taski.dryKissYagni;

// Нарушение DRY: Дублирование кода
public class UserValidation {
    public boolean validateUsername(String username) {
        // Проверка на длину имени
        if (username.length() < 6 || username.length() > 20) {
            return false;
        }
        
        // Проверка на наличие специальных символов
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }
        
        return true;
    }
    
    public boolean validateEmail(String email) {
        // Проверка на длину email
        if (email.length() < 6 || email.length() > 50) {
            return false;
        }
        
        // Проверка на наличие символа '@'
        if (!email.contains("@")) {
            return false;
        }
        
        return true;
    }
}

// Исправлено:
// Вынесли общие проверки в отдельный метод и используем их для валидации.
class UserValidationQ {
    public boolean validateUsername(String username) {
        return isLengthValid(username, 6, 20) && isAlphanumeric(username);
    }
    
    public boolean validateEmail(String email) {
        return isLengthValid(email, 6, 50) && email.contains("@");
    }
    
    private boolean isLengthValid(String input, int minLength, int maxLength) {
        return input.length() >= minLength && input.length() <= maxLength;
    }
    
    private boolean isAlphanumeric(String input) {
        return input.matches("^[a-zA-Z0-9]+$");
    }
}
