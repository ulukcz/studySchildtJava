package main.java.com.ulukbek.javacore.chapter09.TestInterface;

class TestInterface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob; // теперь переменная ссылается на объект типа Anotherclient

        c.callback(42);
    }
}
