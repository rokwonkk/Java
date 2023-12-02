package Observer;

import Observer.dto.Human;

public class Main {
    public static void main(String[] args) {

        /**
         *  Observer : 정찰, 감시
         *              감시자 패턴
         *              user Class <- Observer 삽입
         */

        Human human = new Human();

        //감시자를 추가
        human.addObserver(new ObserverOne());

        human.setId("abc12354");
        human.setPassword("1234567");

        human.notifyObservers(human.getPassword());

    }
}