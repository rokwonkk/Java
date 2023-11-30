package randomgame;

import java.util.Scanner;

public class StartGame {

    Scanner sc = new Scanner(System.in);
    RandomNum rn = new RandomNum();

    private int resultUserIndex;
    private String playerName[];

    private int sand;
    private int settingSand;
    private boolean sandZero = false;

    public StartGame() {
    }

    //초기화
    public void init(){
        rn.setRandom();
        System.out.println("설정된 랜덤 수 = "+rn.getRandom());

        settingSand = rn.getRandom();

        resultUserIndex = 0;

        //플레이어의 이름 입력
        System.out.print("플레이어 몇명입니까?(2~4) >> ");
        int count = sc.nextInt();

        playerName = new String[count];
        for (int i = 0; i < playerName.length; i++) {
            System.out.print((i + 1) + "플레이어 이름 = ");
            playerName[i] = sc.next();
        }
    }

    public void userInput(){

        System.out.println(playerName[resultUserIndex] + "님 차례입니다");

        /** 가져갈 모래 수 15 이하 **/
        System.out.print("가져갈 모래 양 = ");
        sand = sc.nextInt();
    }

    public void finding(){

        /** 랜덤 모래수  - 가져갈 모래 수 **/
        settingSand = settingSand - sand;
        System.out.println(settingSand);

        if (settingSand <= 0){
            System.out.println(playerName[resultUserIndex] + "님이 걸렸지롱 ~~~");
            sandZero = true;
        } else {
            if (resultUserIndex == (playerName.length - 1)){
                resultUserIndex = 0;
            } else {
                resultUserIndex++;
            }
        }
    }

    public void play(){
        init();

        while (true) {
            userInput();
            finding();

            if (sandZero){
                System.out.print("게임 한판 더 ? >> ");
                String retry = sc.next();

                if(retry.equals("n")){
                    System.out.println("수고요 !");
                    break;
                } else {
                    System.out.println("Go Go");
                    sandZero = false;
                    init();
                }
            }
        }
    }
}

