package main.java.com.ulukbek.javacore.chapter09.DefaultIF;

// Использовать метод по умолчанию
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Метод getNumber() можно вызвать, так как он явно
        // реализован в классе MyIFImp:
        System.out.println(obj.getNumber());

        // Метод getString() также можно вызвать, так как в интерфейсе
        // имеется его реализация по умолчанию
        System.out.println(obj.getString());

        int defNum = MyIF.getDefaultNumber();
    }
}
