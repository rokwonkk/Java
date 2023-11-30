package army;

public class Marine extends Unit{

    @Override
    void move(int x, int y) {
        System.out.println("Marine을 "+x+"와 "+y+"로 이동합니다");
    }

    @Override
    void stop() {
        System.out.println("Marine을 정지합니다");
    }
    void stimPack(){
        System.out.println("Marine이 스팀팩을 사용합니다.");
    }
}
