package main.java.com.ulukbek.javacore.chapter09.DefaultIF;

interface MyIF {
    // Это объявление обычного метода в интерфейсе.
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление метода по умолчанию. Обратите
    // внимание на его реализацию по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }

    // Это объявление статистического метода в интерфейсе
    static int getDefaultNumber() {
        return 0;
    }
}
