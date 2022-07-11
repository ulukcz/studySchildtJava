package main.java.com.ulukbek.javacore.chapter09.TestInterface;

// еще одна реализация интерфейса Callback
class AnotherClient implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Еще один вариант вызова метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
