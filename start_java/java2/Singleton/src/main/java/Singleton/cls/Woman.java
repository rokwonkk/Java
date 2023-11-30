package Singleton.cls;

import Singleton.Single.Singleton;

public class Woman {

    private String name;
    private  String address;

    public Woman() {
        address = "부산시 남구";
    }

    public void addressIns(){
        Singleton sl = Singleton.getInstance();

        sl.address = this.address;

    }

    public void proc() {
        Singleton sl = Singleton.getInstance();

        this.name = sl.name;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
