package example;

import example.animal.Animal;
import example.animal.Cat;
import example.animal.Cow;
import example.animal.Dog;
import example.cls.Child;
import example.cls.Parent;

public class Main {
    public static void main(String[] args) {
//        Parent parent = new Parent();
//
//        Child child = new Child();
//        //child에 있는 함수
//        child.func();
//        //parent에 있는 함수
//        child.parent_method();
//
//
        /**
         * 차일드 들을 상위 부모클래스의 parent에 묶어줌.
         */
        Parent p = new Child();
        p.method();

        Cat cat[] = new Cat[10];
        Dog dog[] = new Dog[10];
        Cow cow[] = new Cow[10];

        cat[0] = new Cat();
        cat[1] = new Cat();
        dog[0] = new Dog();
        cow[0] = new Cow();


        /**************************/

        Animal animal[] = new Animal[10];

        animal[0] = new Cat();
        animal[1] = new Cat();
        animal[2] = new Dog();
        animal[3] = new Cow();

        for (int i = 0; i < animal.length; i++) {
            if(animal[i] != null){
                animal[i].speech();

                if(animal[i] instanceof Dog){
                    Dog d = (Dog) animal[i];
                    d.dog_method();
                } else if(animal[i] instanceof Cat){
                    Cat c = (Cat) animal[i];
                    c.cat_method();
                } else if(animal[i] instanceof Cow){
                    Cow co = (Cow) animal[i];
                    co.cow_method();
                }
            }
        }

        /**********************************************/

//        Animal ani = new Dog();
//        ani.speech();
//
//        //instanceOf 어떤객체인지 판단해줌
//        // -> 어떤 자식클래스로 생성됐는지 산출하는 키워드
//        if(ani instanceof Dog){
//            System.out.println("ani는 Dog클래스로 생성됨");
//        }
//
//        //dog에서 dog_method를 사용하고싶은데 사용하려면 ?
//        //자식클래스의 자료형으로 변환해주면됨 (Cast)강제변환
//        //Class에 extends가 없을경우 default는 object이다.
          //object는 최상위에 있다.
//        Dog d = (Dog) ani;
//        d.dog_method();z

    }
}