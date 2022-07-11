package main.java.com.ulukbek.javacore.chapter06.BoxDemo5;

// В этой программе применятся метод с параметрами
class Box {
    double width;
    double height;
    double depth;

    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    // Установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // Иницилиизировать каждый экземпляр класса
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        // Вывести объем первого значения
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // Вывести объем второго значения
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
