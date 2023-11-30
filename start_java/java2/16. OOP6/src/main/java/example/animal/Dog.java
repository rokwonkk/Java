package example.animal;

public class Dog extends Animal{
    @Override
    public void speech() {
        System.out.println("멍멍");
    }

    public void dog_method(){
        System.out.println("꼬리 힘차게 흔들기");
    }
}
