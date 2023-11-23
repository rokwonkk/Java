package example.cls;

public class Parent {

    private String name;
    public Parent() {
        System.out.println("Parent Parent()");
    }

    public Parent(String name){
        this.name = name;
        System.out.println("Parent Parent(String name) name = " + this.name);
    }

    public void method(){
        System.out.println("Parent method()");
    }
}
