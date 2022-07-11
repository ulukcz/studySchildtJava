package main.java.com.ulukbek.javacore.chapter07.InnerClassDemo3;

// Определить внутренний класс в цикле for
class Outer {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("Вывод: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
