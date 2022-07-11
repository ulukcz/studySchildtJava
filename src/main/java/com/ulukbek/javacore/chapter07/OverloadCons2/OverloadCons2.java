package main.java.com.ulukbek.javacore.chapter07.OverloadCons2;

// В этой версии класса Box один объект допускается
// Инициализировать другим объектом
class Box {
    double width;
    double height;
    double depth;
    // Обратите внимание на этот конструктор
    // В качестве параметра в нем используется объект типа Box
    Box(Box ob) {  // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // конструктор, используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор, используемый, когда ни один из размеров не указан
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    // конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }
    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

}

class OverloadCons2 {
    public static void main(String[] args) {
        // Создать папаллелепипеды, используя разные конструкторы
        Box myBox1 = new Box(10, 20,15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        Box myClone = new Box(myBox1); // создать копию объекта myBox1

        double vol;

        // получить объем первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен: " + vol);

        // получить объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен: " + vol);

        // получить объем куба
        vol = myBox3.volume();
        System.out.println("Объем myBox3 равен: " + vol);

        // получить объем клона
        vol = myClone.volume();
        System.out.println("Объем myBox3 равен: " + vol);

    }
}
