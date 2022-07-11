package main.java.com.ulukbek.javacore.chapter07;

// Продемонстрировать применение аргументов переменной длины
class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        // Обратите внимание на возможные способы
        // вызова метода vaTest() с аргументами переменной длиныva
        vaTest(10);         // 1 аргумент
        vaTest(1, 2, 3);    // 3 аргумента
        vaTest();               // без аргументов
    }
}
