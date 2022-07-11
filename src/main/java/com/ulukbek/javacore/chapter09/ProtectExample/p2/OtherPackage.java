package main.java.com.ulukbek.javacore.chapter09.ProtectExample.p2;

import main.java.com.ulukbek.javacore.chapter09.ProtectExample.p1.Protection;

class OtherPackage {
    OtherPackage() {
        main.java.com.ulukbek.javacore.chapter09.ProtectExample.p1.Protection p = new main.java.com.ulukbek.javacore.chapter09.ProtectExample.p1.Protection();
        System.out.println("Конструктор из другого пакета");
        // Доступ только для данного класса и пакета
        // System.out.println("n = " + n);
        // доступно только для класса
        // System.out.println("n_pri = " + n_pri);
        // Доступ только для данного класса, подкласса(из другого пакета) и пакета
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
