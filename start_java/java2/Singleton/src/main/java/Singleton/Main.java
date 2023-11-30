package Singleton;

import Singleton.cls.Animal;
import Singleton.cls.Human;
import Singleton.cls.Woman;

public class Main {
    public static void main(String[] args) {

        Human h = new Human();
        Animal a = new Animal();
        Woman w = new Woman();
//        String name = h.getName();
//        a.setName(name);
//
//        System.out.println(a.toString());

//        Singleton instance = Singleton.getInstance();
//        System.out.println(instance);
//
//        System.out.println(instance);
//
//        Singleton instance1 = Singleton.getInstance();
//        System.out.println(instance1);

        h.func();
        a.method();
        w.proc();

        w.addressIns();
        h.address();

        System.out.println(a.toString());
        System.out.println(w.toString());
        System.out.println(h.toString());
    }
}