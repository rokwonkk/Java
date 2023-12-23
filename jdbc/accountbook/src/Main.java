import accountbook.AccountBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AccountBook book = new AccountBook();

        while (true){

            System.out.println("번호를 입력하세요 >>");

            while (true){
                System.out.println("");
                System.out.println("========== 가계부 프로그램 ===============");
                System.out.println("==\t1\t<--\t가계부추가\t\t\t\t\t==");
                System.out.println("==\t2\t<--\t가계부삭제\t\t\t\t\t==");
                System.out.println("==\t3\t<--\t가계부수정\t\t\t\t\t==");
                System.out.println("==\t4\t<--\t가계부검색(날짜)\t\t\t==");
                System.out.println("==\t5\t<--\t가계부검색(제목)\t\t\t==");
                System.out.println("==\t6\t<--\t가계부검색(내용)\t\t\t==");
                System.out.println("==\t7\t<--\t가계부검색(날짜범위)\t\t==");
                System.out.println("==\t8\t<--\t월별 결산\t\t\t\t\t==");
                System.out.println("==\t9\t<--\t총 결산\t\t\t\t\t\t==");
                System.out.println("==\t20\t<--\t가계부전체검색(테스트용)\t==");
                System.out.println("==========================================");
                System.out.print("메뉴 번호를 입력해주세요 >> ");
                //안정성을 고려해서 스트링으로 받는게 낫지만 일단 인트로 함.
                int menuNumber = sc.nextInt();

                switch (menuNumber){
                    //menu
                    //가계부 등록
                    case 1 -> book.create();

                    //가계부 삭제
                    case 2 -> book.delete();

                    //가계부 수정
                    case 3 -> book.update();

                    //검색 날짜
                    case 4 -> book.dateSearch();

                    //검색 제목
                    case 5 -> book.titleSearch();

                    //검색 내용
                    case 6 -> book.commentSearch();

                    //검색 범위
                    case 7 -> book.dateRangeSearch();

                    //월별 결산(수입-지출)
                    case 8 -> book.monthSet();

                    //총 결산(수입-지출)
                    case 9 -> book.totalSet();

                    //검색 전체 검색
                    case 20 -> book.search();

                    default -> System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                }
            }
        }

    }
}