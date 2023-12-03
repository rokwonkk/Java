package factory.partfactory;

import factory.animal.Animal;
import factory.animal.Cat;
import factory.animal.Cow;
import factory.animal.Dog;

public class PartFactory1 {

    public static Part create(String partName){

        if(partName.isEmpty()){
            System.out.println("생성할 클래스가 없습니다.");
        }else if(partName.equals("너트")){
            return new Nut();
        }else if(partName.equals("볼트")){
            return new Volt();
        }else if (partName.equals("와셔")){
            return new Washer();
        }else if (partName.equals("나사")){
            return new Screw();
        }
        return null;
    }

}
