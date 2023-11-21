package randomgame;

import java.util.Scanner;

public class StartGame {

    Scanner sc = new Scanner(System.in);
    RandomNum rn = new RandomNum();

    private int sand;
    private int settingSand;
    private boolean sandZero = false;

    //초기화
    public void init(){
        rn.setRandom();
        System.out.println("설정된 랜덤 수 = "+rn.getRandom());

        settingSand = rn.getRandom();
    }

    public void userInput(){
        /** 가져갈 모래 수 15 이하 **/
        System.out.print("가져갈 모래 양 = ");
        sand = sc.nextInt();
    }

    public void finding(){

        /** 랜덤 모래수  - 가져갈 모래 수 **/
        settingSand = settingSand - sand;
        System.out.println(settingSand);

        if (settingSand <= 0){
            System.out.println("당신이 걸렸습니다");
            sandZero = true;
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

