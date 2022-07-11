package main.java.com.ulukbek.javacore.chapter06.BoxDemo;

/* Программа, использующая класс Box
Присвоить Исходному файлу BoxDemo.java */
class Box {
    double width;
    double height;
    double depth;
}

// В этом классе обявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();

        double vol;
        // Присвоить значение переменным экземпляра Box
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Объем равен " + vol);
    }
}


