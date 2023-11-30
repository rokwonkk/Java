package example.car;

public class Audi extends Kind{

    @Override
    public void speedUp() {
        System.out.println("아우디의 속도를 증가시켰습니다.");
    }

    public void audi_method(){
        System.out.println("아우디는 슈퍼 엔진");
    }

}
