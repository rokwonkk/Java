package army;

public class Tank extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("Tank을 "+x+"와 "+y+"로 이동합니다");
    }

    @Override
    void stop() {
        System.out.println("Tank을 정지합니다");
    }

    void changeMode(){
        System.out.println("Tank의 공격모드를 변환합니다.");
    }
}
