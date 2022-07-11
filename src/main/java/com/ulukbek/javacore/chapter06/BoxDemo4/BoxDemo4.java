package main.java.com.ulukbek.javacore.chapter06.BoxDemo4;

// теперь метод volume() возвращает объем параллелепипеда
class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // Присвоить значение переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Присвоить другие значение переменным экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Вывести объем первого значения
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // Вывести объем второго значения
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
