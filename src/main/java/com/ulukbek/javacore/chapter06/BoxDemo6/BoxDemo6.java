package main.java.com.ulukbek.javacore.chapter06.BoxDemo6;

// В данном примере программы для инициализации размеров
// параллелепипеда в классе Box применяется конструктор
class Box {
    double width;
    double height;
    double depth;
    // Это конструктор класса Box
    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

}

public class BoxDemo6 {
    public static void main(String[] args) {
        // Объявить, выделить память и инициальизировать объекты типа Box
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // Вывести объем первого значения
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // Вывести объем второго значения
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
