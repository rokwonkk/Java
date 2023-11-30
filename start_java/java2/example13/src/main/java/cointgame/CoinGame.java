package cointgame;

import java.util.Scanner;

public class CoinGame {
    boolean coinYn;
    boolean sumYn;

    int coin = 20;
    int startCoin;
    int number[] = new int[2];
    int randomDiceSum;
    int inputSumDice;
    Scanner sc = new Scanner(System.in);

    public int input() {

        System.out.println("현재 가진 코인 개수는 : " + coin + "개 입니다");

        while (true) {
            System.out.print("배팅할 코인 갯수를 입력하세요 >> ");
            startCoin = sc.nextInt();

            if (startCoin > coin) {
                System.out.println("현재 가진 코인 수량 보다 많습니다.");
                coinYn = false;
            } else {
                coin = coin - startCoin;
                coinYn = true;
            }

            if (coinYn) {
                break;
            }
        }


        while (true) {
            System.out.print("두 주사위의 합을 입력하세요 >> ");
            inputSumDice = sc.nextInt();
            if (inputSumDice < 2 || inputSumDice > 12) {
                System.out.println("3~11 까지의 숫자만 입력이 가능!.");
                sumYn = false;
            } else {
                sumYn = true;
            }

            if (sumYn) {
                break;
            }
        }
        return inputSumDice;
    }

    private int randomDiceSum(){
        number[0] = (int) (Math.random() * 6) + 1;
        number[1] = (int) (Math.random() * 6) + 1;

        randomDiceSum = number[0] + number[1];
        return randomDiceSum;
    }

    public void finishDiceGame(int inputSumCoin, int randomDiceSum){
        if (inputSumCoin == randomDiceSum){
            System.out.println("congratulations !!!!!!!!!!!!!!");
            if(inputSumCoin == 3 || inputSumCoin == 11){
                coin += startCoin * 18;
                System.out.println("18배 당첨");
            } else if(inputSumCoin == 4 || inputSumCoin == 10){
                coin += startCoin * 12;
                System.out.println("12배 당첨");
            }else if(inputSumCoin == 5 || inputSumCoin == 9){
                coin += startCoin * 9;
                System.out.println("9배 당첨");
            }else if(inputSumCoin == 6 || inputSumCoin == 8){
                coin += startCoin * 7;
                System.out.println("7배 당첨");
            }else if(inputSumCoin == 7 ){
                coin += startCoin * 6;
                System.out.println("6배 당첨");
            }
        } else {
            System.out.println("낄낄낄 다음기회에.");
        }
        System.out.println(coin);
    }

    public void play(){
        while (true) {
            int inputSumDice = input();
            System.out.println(inputSumDice);

            int randomDice = randomDiceSum();
            System.out.println(randomDice);

            finishDiceGame(inputSumDice, randomDice);

            if (coin == 0){
                System.out.println("코인이 없는데? 추가해서 도전하렴 bye~");
                break;
            }

            System.out.print("play again(y/n) >> ");
            String again = sc.next();

            if (again.equals("n")) {
                System.out.println("bye~");
                break;
            }
            System.out.println("play restart");
        }
    }
}