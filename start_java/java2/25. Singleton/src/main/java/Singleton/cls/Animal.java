package Singleton.cls;

import Singleton.Single.Singleton;

public class Animal {

    private String name;
    private String address;
//    public void setName(String name) {
//        this.name = name;
//    }

    public void method(){
        //singleton class의 instance를 취득하고
        Singleton sl = Singleton.getInstance();

        //singleton class의 name 변수로 부터 값을 취득
        this.name = sl.name;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                '}';
    }
}
