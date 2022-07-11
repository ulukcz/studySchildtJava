package main.java.com.ulukbek.javacore.chapter08.AbstractDemo;

// Простой пример абстракции
abstract class A {
    abstract void callMe();
    // абстрактные классы все же могут содержать конкретные методы
    void callMeToo() {
        System.out.println("Это конкретный метод.");
    }
}
class B extends A {
    void callMe() {
        System.out.println("Реализция метода callNe() в классе В");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();

        b.callMe();
        b.callMeToo();
    }
}
