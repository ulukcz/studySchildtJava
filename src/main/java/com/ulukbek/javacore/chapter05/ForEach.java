package main.java.com.ulukbek.javacore.chapter05;

// Применение цикла for в стиле цикла for each
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Использовать цикл в стиле for eacb для вывода\
        // и суммирования значений
        for (int x: nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
