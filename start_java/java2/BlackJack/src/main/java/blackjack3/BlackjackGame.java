package blackjack3;

import java.util.Scanner;

public class BlackjackGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coins = 500; // 시작할 때 보유하고 있는 코인의 수

        // 게임 시작 메시지 출력
        printSlowly("=========================================\n");
        printSlowly("||                                     ||\n");
        printSlowly("|| 블랙잭 게임에 오신 것을 환영합니다! ||\n");
        printSlowly("||                                     ||\n");
        printSlowly("=========================================\n");
        printSlowly("Rules:\n");
        printSlowly("1. 시작할 때 500 코인을 받습니다.\n");
        printSlowly("2. 각 라운드마다 1부터 50 사이의 코인을 배팅하세요.\n");
        printSlowly("3. 21에 가까워지려고 하되 21을 초과하지 마세요(버스트).\n");
        printSlowly("4. 딜러를 이기면 배팅금액의 2배를 획득합니다!\n");
        printSlowly("5. 블랙잭(첫 두 장으로 21 만들기) 시 배팅금액의 3배!\n");
        printSlowly("=========================================\n");

        while (coins > 0) {
            int bet = 0;

            System.out.println("\n보유 코인: " + coins);

            // 배팅 받기
            while (true) {
                System.out.print("배팅금액을 입력하세요 (최대 50, 0은 나가기): ");
                // 예외 처리를 위한 루프
                while (!sc.hasNextInt()) {
                    System.out.println("숫자를 입력하세요.");
                    sc.next(); // 입력 버퍼 비우기
                }

                bet = sc.nextInt();

                if (bet >= 0 && bet <= 50) {
                    break;
                } else {
                    System.out.println("배팅금액은 0부터 50까지만 가능합니다.");
                }
            }

            if (bet == 0) {
                System.out.println("게임을 종료합니다. 총 보유한 코인: " + coins);
                break;
            }

            Deck deck = new Deck();
            Hand playerHand = new Hand();
            Hand dealerHand = new Hand();

            playerHand.addCard(deck.drawCard());
            playerHand.addCard(deck.drawCard());

            dealerHand.addCard(deck.drawCard());
            dealerHand.addCard(deck.drawCard());

            System.out.println("당신의 패:");
            playerHand.display();
            System.out.println("당신의 점수: " + playerHand.calculateScore());

            System.out.println("\n딜러의 패:");
            System.out.println(dealerHand.calculateScore() <= 21 ? dealerHand : dealerHand.display().get(0) + "\n[숨겨진 카드]");

            // 블랙잭 체크
            if (playerHand.calculateScore() == 21) {
                System.out.println("블랙잭! 3배의 보상을 받습니다.");
                coins += bet * 3;
                continue;
            }

            // 플레이어의 선택
            while (true) {
                System.out.print("\n카드를 더 받을까요, 아니면 멈출까요? (y/n) ");
                String choice = sc.next().toLowerCase();

                if (choice.equals("y")) {
                    playerHand.addCard(deck.drawCard());
                    System.out.println("당신의 패:");
                    playerHand.display();
                    int playerScore = playerHand.calculateScore();
                    System.out.println("당신의 점수: " + playerScore);

                    if (playerScore > 21) {
                        System.out.println("버스트! 배팅금액을 잃었습니다.");
                        coins -= bet;
                        break;
                    }
                } else if (choice.equals("n")) {
                    while (dealerHand.calculateScore() < 17) {
                        dealerHand.addCard(deck.drawCard());
                    }
                    System.out.println("\n딜러의 패:");
                    dealerHand.display();
                    int dealerScore = dealerHand.calculateScore();
                    System.out.println("딜러의 점수: " + dealerScore);

                    // 승패 결정 및 배팅금액 처리
                    if (dealerScore > 21 || playerHand.calculateScore() > dealerScore) {
                        System.out.println("축하합니다! 이겼습니다!");
                        coins += bet * 2;
                    } else if (playerHand.calculateScore() < dealerScore) {
                        System.out.println("아쉽지만 패배하셨습니다.");
                        coins -= bet;
                    } else {
                        System.out.println("무승부입니다. 배팅금액을 반환받습니다.");
                    }

                    break;
                } else {
                    System.out.println("잘못된 선택입니다. 'y' 또는 'n' 중 하나를 입력하세요.");
                }
            }
        }
        System.out.println("보유한 코인이 부족하거나 게임을 종료하셨습니다. 게임 종료!");
        sc.close();
    }

    private static void printSlowly(String message) {
        try {
            for (char ch : message.toCharArray()) {
                System.out.print(ch);
                Thread.sleep(5); // 글자 하나 출력 후 30밀리초 대기
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}