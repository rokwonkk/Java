package example.cls;

public class Parent {

    //private는 부모님 클래스에서만 사용하는 자산이기때문에 상속을 하더라도 자식이 접근 할 수 없다.

    private int number;
    public String name;

    //외부접근차단. 자식클래스만 접근 허용
    protected String address;

    public void Parent_method(){
        System.out.println("Parent Parent_method()");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
