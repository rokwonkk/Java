package Singleton.cls;

import Singleton.Single.Singleton;

public class Human {

    private String name;
    private String address;
    public Human() {
        name = "성춘향";
    }

    public String getName() {
        return name;
    }

    public void func(){
        //singleton class의 instance를 취득하고
        Singleton sl = Singleton.getInstance();

        //그 인스턴스의 변수에 값을 넣는다.
        sl.name = this.name;

    }

    public void address(){
        Singleton sl = Singleton.getInstance();

        this.address = sl.address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
