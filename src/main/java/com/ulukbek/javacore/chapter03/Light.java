package main.java.com.ulukbek.javacore.chapter03;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 1000; // указать количество дней

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль");
    }
}
