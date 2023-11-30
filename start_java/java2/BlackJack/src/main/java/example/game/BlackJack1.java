package example.game;

import java.util.Scanner;

public class BlackJack1 {

    Scanner sc = new Scanner(System.in);

    RandomCard myCn1 = new RandomCard();
    RandomCard myCn2 = new RandomCard();
    RandomCard dealCn1 = new RandomCard();
    RandomCard dealCn2 = new RandomCard();

    int stayCoin;
    int bettingCoin;

    int myCard;
    int dealCard;

    boolean burst = false;
    boolean blackJack = false;
    int finish;
    public BlackJack1() {
        stayCoin = 100;
    }

    public void init(){
        System.out.println("BlackJack.init");
        myCn1.setRandom();
        myCn2.setRandom();
        dealCn1.setRandom();
        dealCn2.setRandom();
    }

    public void betting(){
        System.out.println("BlackJack.betting");

        System.out.println("잔여 코인 : "+stayCoin);
        System.out.print("얼마를 배팅 하겠습니까? ");
        bettingCoin = sc.nextInt();

        stayCoin = stayCoin - bettingCoin;
        System.out.println("배팅 코인 : " + bettingCoin);

        System.out.println("남은 코인 : " + stayCoin);
    }

    public void playBj(){
        System.out.println("BlackJack.play");

        if(myCard == 0 && dealCard == 0) {
            myCard = myCn1.getRandom() + myCn2.getRandom();
            dealCard = dealCn1.getRandom() + dealCn2.getRandom();
        }

        System.out.println("myCard " + myCard);
        System.out.println("dealCard " + dealCard);

        System.out.print("카드를 추가하시겠습니까? (y/n) >> ");
        String addCard = sc.next();

        if (addCard.equals("y")) {
            RandomCard addRandomCard = new RandomCard();
            addRandomCard.setRandom();
            System.out.println("추가하는 카드 넘버" + addRandomCard.getRandom());
            myCard += addRandomCard.getRandom();
        }

        if (dealCard < 17){
        int dealNewCard = (int)(Math.random() * 2) + 1;
        if (dealNewCard == 1){
            System.out.println("딜러도 카드를 추가하였습니다.");
            RandomCard addRandomCard = new RandomCard();
            addRandomCard.setRandom();
            System.out.println("추가하는 카드 넘버" + addRandomCard.getRandom());
            dealCard += addRandomCard.getRandom();
            } else {
                System.out.println("딜러는 카드를 추가하지 않았습니다.");
            }

            System.out.println("추가 후 myCard " + myCard);
            System.out.println("추가 후 dealCard " + dealCard);
        } else {
            System.out.println("딜러는 17 이상이므로 추가 카드를 받지 않습니다.");
        }
    }
    private void Judgment() {
        /**
         * 판정 부분
         */
        //블랙잭일 경우 분기
        if(myCard == 21 || dealCard == 21){
            if (myCard == 21 && dealCard == 21){
                System.out.println("둘다 블랙젝 입니다. 무승부.");
                stayCoin += bettingCoin;
            } else if (myCard == 21){
                System.out.println("축하합니다. 당신은 블랙젝입니다. 배팅한 금액의 3배를 받습니다");
                stayCoin += bettingCoin * 3;
            } else {
                System.out.println("아이고야.. 딜러는 블랙잭입니다.");
            }
            blackJack = true;
        //블랙잭이 아닐 경우
        } else {
            if (myCard > 21){
                System.out.println("당신은 21을 초과하여 버스트 했습니다. 딜러가 이겼습니다.");
            } else if(dealCard > 21) {
                System.out.println("딜러는 21을 초과하여 버스트 했습니다. 당신이 이겼습니다.");
                stayCoin += bettingCoin * 2;
            }
            burst = true;
        }

        if(myCard < 21 && dealCard < 21){
            if (myCard > dealCard){
                System.out.println("당신의 승리입니다.");
                finish = 1;
                stayCoin += bettingCoin * 2;
            } else if (myCard < dealCard){
                System.out.println("딜러의 승리입니다.");
                finish = 2;
            } else {
                System.out.println("무승부입니다.");
                finish = 3;
                stayCoin += bettingCoin;
            }
        }
    }

    public void playStart(){
        init();
        betting();

        while (true) {
            playBj();
            Judgment();

            if (burst || blackJack){
                String retryYn = sc.next();
                if (retryYn.equals("n")){
                    System.out.println("잘가세요!");
                    break;
                }
            }
        }
    }
}
