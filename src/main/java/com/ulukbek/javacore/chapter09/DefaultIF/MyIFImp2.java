package main.java.com.ulukbek.javacore.chapter09.DefaultIF;

class MyIFImp2 implements MyIF{
    // В этом классе представляется реализация обоих методов
    // getString() и getNumber()
    public int getNumber() {
        return 100;
    }
    public String getString() {
        return "Это другая символьная строка";
    }
}
