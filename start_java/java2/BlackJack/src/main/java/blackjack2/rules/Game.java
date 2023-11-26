package blackjack2.rules;

import blackjack2.cards.Card;
import blackjack2.cards.CardDeck;
import blackjack2.person.Dealer;
import blackjack2.person.Gamer;
import blackjack2.person.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT = 2;

    // 게임에 필요한 인스턴스 생성
    public void play() {
        System.out.println("====Blackjack====");
        Scanner sc = new Scanner(System.in);

        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();

//        System.out.println(cardDeck.toString());
//        System.out.println(cardDeck.draw());
        List<Player> players = Arrays.asList(new Gamer(), new Dealer());
        initPhase(cardDeck, players);
        playingPhase(sc, cardDeck, gamer, dealer);
    }

    private void playingPhase(Scanner sc, CardDeck cardDeck, Gamer gamer, Dealer dealer) {
        String gamerInput, dealerInput;
        boolean isGamerTurn = false;
        boolean isDealerTurn = false;

        while (true) {
            System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
            gamerInput = sc.nextLine();

            if ("0".equals(gamerInput)) isGamerTurn = true;
            else {
                Card card = cardDeck.draw();
                gamer.receiveCard(card);
            }

            System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
            dealerInput = sc.nextLine();

            if ("0".equals(dealerInput)) {
                isDealerTurn = true;
            } else {
                Card card = cardDeck.draw();
                dealer.receiveCard(card);
            }

            if (isGamerTurn && isDealerTurn) {
                break;
            }

            Card card = cardDeck.draw();  // 카드 뽑기
            gamer.receiveCard(card);  // 게이머가 카드 받고 확인
        }
    }

    private void initPhase(CardDeck cardDeck, List<Player> players) {
        // 처음 시작할때 게이머가 2장의 카드를 받는 메서드
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
        for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
            Card card = cardDeck.draw();
//            players.receiverCard(card);
        }
    }
}
