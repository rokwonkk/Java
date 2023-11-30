package randomgame;

import java.util.Scanner;

public class GameTeacher {
    /** composition(합성) 클래스 안에서 클래스 **/
    Scanner sc = new Scanner(System.in);

    private int rand_num;
    private int user_num;

    private String playerName[];

    private boolean gameover;

    private int resultUserIndex;

    //생성자(초기값)
    public GameTeacher(){

    }

    public void init(){
        resultUserIndex = 0;
        gameover = false;

        //플레이어의 이름 입력
        System.out.print("플레이어 몇명입니까?(2~4) >> ");
        int count = sc.nextInt();

        playerName = new String[count];
        for (int i = 0; i < playerName.length; i++) {
            System.out.print((i + 1) + "플레이어 이름 = ");
            playerName[i] = sc.next();
        }

        //random 설정
        setRandom();
    }

    public void setRandom(){
        rand_num = (int)(Math.random() * 71) + 30;
    }

    public void userInput(){

        System.out.print("얼마만큼 모래를 가져오겠습니까");
        user_num = sc.nextInt();

    }

    public void play(){
        while (true){
            System.out.println(playerName[resultUserIndex] + "님 차례입니다");

            userInput();

            rand_num = rand_num - user_num;

            if (rand_num <= 0){
                break;
            }
            System.out.println("continue please...");
            if (resultUserIndex == (playerName.length - 1)){
                resultUserIndex = 0;
            } else {
                resultUserIndex++;
            }
        }

        result();
    }

    public void result(){
        System.out.println(playerName[resultUserIndex] + "님 당신이 걸렸습니다");
    }

    public void gamePlay() {
        while(true) {
            init();

            play();

            System.out.print("play again(y/n)? = ");
            String again = sc.next();

            if(again.equals("n")) {
                System.out.println("안녕히 가십시오");
                break;
            }

            System.out.println("다시 게임을 시작합니다");
        }
    }
}
