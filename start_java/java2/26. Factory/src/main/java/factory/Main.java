package factory;

import factory.animal.Animal;
import factory.animal.Cat;
import factory.animal.Cow;
import factory.animal.Dog;
import factory.partfactory.*;

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

        List<Part> partList = new ArrayList<>();
//
//        Animal a = null;
//
        String partName[] = {"나사", "볼트", "와셔", "볼트", "볼트", "너트"};

        for (int i = 0; i < partName.length; i++) {
            Part a = PartFactory1.create(partName[i]);
            partList.add(a);
        }

        for (int i = 0; i < partList.size(); i++) {
            Part a = partList.get(i);

            if(a instanceof Volt b){
                b.make();
            }else if(a instanceof Nut b){
                b.make();
            }else if(a instanceof Washer b){
                b.make();
            }else if(a instanceof Screw b){
                b.make();
            }
        }


    }
}