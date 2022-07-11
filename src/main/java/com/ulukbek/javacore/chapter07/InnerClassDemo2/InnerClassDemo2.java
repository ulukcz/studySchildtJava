package main.java.com.ulukbek.javacore.chapter07.InnerClassDemo2;

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // Это внутренний класс
    class Inner {
        int y = 10;  // y - локальная переменная класса Inner
        void display() {
            System.out.println("Вывод: outer_x = " + outer_x);
        }
    }
    void showy() {
//        System.out.println(y); // ошибка, здесь переменная y недоступна
    }
}
class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
