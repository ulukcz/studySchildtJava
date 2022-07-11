package main.java.com.ulukbek.javacore.chapter09.DefaultIF;

// реализовать интерфейс MyIF
class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только метод getNumber(),
    // определенный в интерфейсе MyIF.
    // А вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}
