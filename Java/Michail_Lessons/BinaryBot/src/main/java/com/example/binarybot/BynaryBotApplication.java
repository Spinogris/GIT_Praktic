package com.example.binarybot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.nio.charset.StandardCharsets;
public class BynaryBotApplication extends TelegramLongPollingBot {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        BynaryBotApplication bot = new BynaryBotApplication();
        bot.runBot();
    }

    private void runBot() {
        try {
            execute(this);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void execute(BynaryBotApplication bynaryBotApplication) {

    }

    @Override
    public String getBotToken() {
        // Здесь укажите токен вашего бота
        return "Bin_Bot";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = update.getMessage();
            String text = message.getText();

            // Конвертация текста в бинарный вид
            String binaryText = textToBinary(text);

            // Отправка ответа с бинарным текстом
            SendMessage response = new SendMessage();

            try {
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    private String textToBinary(String text) {
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        StringBuilder binaryText = new StringBuilder();

        for (byte b : bytes) {
            for (int i = 7; i >= 0; i--) {
                binaryText.append((b & (1 << i)) == 0 ? '0' : '1');
            }
            binaryText.append(" ");
        }

        return binaryText.toString().trim();
    }

    @Override
    public String getBotUsername() {
        // Здесь укажите имя вашего бота
        return "Binary_Bot";
    }

    private static class ApiContextInitializer {
        public static void init() {

        }
    }
}
