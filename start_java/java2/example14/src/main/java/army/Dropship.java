package army;

public class Dropship extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("Dropship을 "+x+"와 "+y+"로 이동합니다");
    }

    @Override
    void stop() {
        System.out.println("Dropship을 정지합니다");
    }

    void load(){
        System.out.println("Dropship이 선택된 대상을 태웁니다");
    }

    void unload(){
        System.out.println("Dropship이 선택된 대상을 내립니다");
    }

}
