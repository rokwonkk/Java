package cointgame;

import java.util.Scanner;

public class GameTeacher {

    Scanner sc = new Scanner(System.in);

    private int coin = 20;
    private int batting;

    private int userNumber;

    DiceTeacher diceOne = new DiceTeacher();
    DiceTeacher diceTwo = new DiceTeacher();

    /* methods */
    /* 초기화(random 값) */
    public void init() {
        diceOne.setRandom();
        diceTwo.setRandom();

        System.out.println("주사위 1 : " + diceOne.getNumber());
        System.out.println("주사위 2 : " + diceTwo.getNumber());
    }

    /* user input */
    public void userInput(){
        /** 배팅금액 **/
        System.out.print("금액 = ");
        batting = sc.nextInt();

        /** 소장금 - 배팅금액 **/
        coin = coin - batting;

        /** 주사위의 합 **/
        while (true){
            System.out.print("주사위의 합 = ");
            userNumber = sc.nextInt();
            if (userNumber == 2 || userNumber == 12){
                System.out.println("1~11사이의 숫자를 입력해주세요 >> ");
                continue;
            }
            break;
        }
    }

    /* finding 판정 */
    public void finding(){
        /** 랜덤받은 주사위의 합 **/
        int dice1 = diceOne.getNumber();
        int dice2 = diceTwo.getNumber();

        int diceSum = dice1 + dice2;

        if (userNumber == diceSum){

            if (diceSum == 3 || diceSum == 11){
                batting = batting * 18;
            } else if (diceSum == 4 || diceSum == 10) {
                batting = batting * 12;
            }else if (diceSum == 5 || diceSum == 9) {
                batting = batting * 9;
            }else if (diceSum == 6 || diceSum == 8) {
                batting = batting * 7;
            }else if (diceSum == 7) {
                batting = batting * 6;
            }

            System.out.println("빙고! 축하합니다");
            coin = coin + batting;
        } else {
            System.out.println("아쉽습니다. 다시 도전 하세요");
        }
    }

    /* result 결과 */
    public void result(){
        System.out.println("주사위1 : " + diceOne.getNumber());
        System.out.println("주사위2 : " + diceTwo.getNumber());

        System.out.println("주사위의 합 : " + diceOne.getNumber() + diceTwo.getNumber());
        System.out.println("현재 금액 : " + coin);
    }

    public void play(){
        while (true) {
            init();
            userInput();
            finding();
            result();

            System.out.print("play again(y/n) >> ");
            String again = sc.next();

            if (again.equals("n")){
                System.out.println("bye~");
                break;
            }
            System.out.println("play restart");
        }
    }
}
