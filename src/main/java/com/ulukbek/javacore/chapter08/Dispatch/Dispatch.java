package main.java.com.ulukbek.javacore.chapter08.Dispatch;

// Динамическая диспатчеризация методов
class A {
    void callMe() {
        System.out.println("В методе callMe() класса А");
    }
}
class B extends A {
    // переопределить метод callMe()
    void callMe() {
        System.out.println("В методе callMe() класса B");
    }
}
class C extends A {
    // переопределить метод callMe()
    void callMe() {
        System.out.println("В методе callMe() класса C");
    }
}
class Dispatch {
    public static void main(String[] args) {
        A a = new A();      // объект класса А
        B b = new B();      // объект класса B
        C c = new C();      // объект класса C

        A r;                // получить ссылку на объект типа А
        r = a;              // переменная r ссылается на объект типа А
        r.callMe();         // вызвать вариант метода callMe(),
                            // определенный в классе А
        r = b;              // переменная r ссылается на объект типа B
        r.callMe();         // вызвать вариант метода callMe(),
                            // определенный в классе B
        r = c;              // переменная r ссылается на объект типа C
        r.callMe();         // вызвать вариант метода callMe(),
                            // определенный в классе C
    }
}
