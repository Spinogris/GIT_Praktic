package org.example._2023_12_06.taski.dryKissYagni;

// Нарушение SOLID: Нарушение принципа инверсии зависимостей
public class LightBulb {
    public void turnOn() {
        // Включение лампочки
    }
    
    public void turnOff() {
        // Выключение лампочки
    }
}

class SwitchQ {
    private LightBulbQ bulb;
    
    public SwitchQ(LightBulbQ bulb) {
        this.bulb = bulb;
    }
    
    public void press() {
        bulb.turnOn();
    }
}

// Исправлено:
// Введен интерфейс для лампочки и использование его вместо конкретного класса.
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulbQ implements Switchable {
    public void turnOn() {
        // Включение лампочки
    }
    
    public void turnOff() {
        // Выключение лампочки
    }
}

class Switch {
    private Switchable device;
    
    public Switch(Switchable device) {
        this.device = device;
    }
    
    public void press() {
        device.turnOn();
    }
}
