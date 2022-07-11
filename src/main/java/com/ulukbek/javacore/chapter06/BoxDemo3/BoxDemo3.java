package main.java.com.ulukbek.javacore.chapter06.BoxDemo3;

// В этой программе выполняется метод, введеный в класс Box
class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}
public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        // Присвоить значение переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Присвоить другие значение переменным экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Вывести объем первого значения
        myBox1.volume();

        // Вывести объем второго значения
        myBox2.volume();
    }
}
