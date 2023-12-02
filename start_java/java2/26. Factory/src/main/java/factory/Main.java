package factory;

import factory.animal.Animal;
import factory.animal.Cat;
import factory.animal.Cow;
import factory.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         *  Singleton Pattern : 중심(접근, list, map)이 되는 데이터나 클래스로써
         *                      어디(클래스)에서나 접근이 용이하게 하기 위한 패턴
         *
         *  Factory Pattern : 원하는 클래스의 형태를 생성하기 위한 패턴
         *
         */

//        Animal animal1 = AnimalFactory.create("멍멍이");
//        Animal animal2 = AnimalFactory.create("야옹이");
//        Animal animal3 = AnimalFactory.create("소");
//
//        animal1.printDescript();
//        animal2.printDescript();
//        animal3.printDescript();
//
//        Dog d = (Dog) animal1;
//        d.dogMethod();
//
//        ((Cat)animal2).catMethod();

        List<Animal> animalList = new ArrayList<>();

//        Animal a = null;

        String animalName[] = {"소", "소", "야옹이", "멍멍이", "멍멍이", "멍멍이"};

        for (int i = 0; i < animalName.length; i++) {
            Animal a = AnimalFactory.create(animalName[i]);
            animalList.add(a);
        }

        for (int i = 0; i < animalList.size(); i++) {
            Animal a = animalList.get(i);

            a.printDescript();

            if(a instanceof Cat cat){
                cat.catMethod();
            }else if(a instanceof Dog dog){
                dog.dogMethod();
            }else if(a instanceof Cow cow){
                cow.cowMethod();
            }
        }
    }
}