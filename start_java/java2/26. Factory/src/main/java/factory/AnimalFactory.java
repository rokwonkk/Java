package factory;

import factory.animal.Animal;
import factory.animal.Cat;
import factory.animal.Cow;
import factory.animal.Dog;

public class AnimalFactory  {

    //원하는 클래스를 생성하는 함수
    public static Animal create(String animalName){

        if(animalName.equals("")){
            System.out.println("생성할 클래스가 없습니다.");
        }else if(animalName.equals("야옹이")){
            return new Cat();
        }else if(animalName.equals("멍멍이")){
            return new Dog();
        }else if (animalName.equals("소")){
            return new Cow();
        }
        return null;
    }
}
