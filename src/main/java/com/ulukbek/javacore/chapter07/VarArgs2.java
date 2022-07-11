package main.java.com.ulukbek.javacore.chapter07;

// Использовать аргументы переменной длины вместе со стандартыми аргументами
class VarArgs2 {
    // В данном примере msg - обычный параметр,
    // а v - параметр переменной длины
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        // Обратите внимание на возможные способы
        // вызова метода vaTest() с аргументами переменной длиныva
        vaTest("Один параметр переменной длины: ",10);         // 1 аргумент
        vaTest("Три параметра переменной длины: ", 1, 2, 3);    // 3 аргумента
        vaTest("Без параметров переменной длины: ");               // без аргументов
    }
}
