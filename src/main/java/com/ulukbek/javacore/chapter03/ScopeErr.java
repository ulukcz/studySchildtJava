package main.java.com.ulukbek.javacore.chapter03;

// Скомпилировать эту программу нельзя
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {                   // Создается новая область действия
            int bar = 2;    // Ошибка во время компиляции -
        }                   // переменная уже определена!
    }
}