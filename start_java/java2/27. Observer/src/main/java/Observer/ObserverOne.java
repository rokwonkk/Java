package Observer;

import java.util.Observable;
import java.util.Observer;

//감시자 클래스
public class ObserverOne implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String str = (String) arg;

        System.out.println("감시자 One 입니다 통지받았음" + str);


        //받은 데이터를 전송

    }
}
