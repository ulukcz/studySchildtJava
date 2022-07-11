package main.java.com.ulukbek.javacore.chapter06.BoxDemo7;

// В данном примере программы для инициализации размеров
// параллелепипеда в классе Box применяется параметихированыый конструктор
class Box {
    double width;
    double height;
    double depth;
    // Это конструктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

}

public class BoxDemo7 {
    public static void main(String[] args) {
        // Объявить, выделить память и инициальизировать объекты типа Box
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        // Получить объем первого значения
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // Получить объем второго значения
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
