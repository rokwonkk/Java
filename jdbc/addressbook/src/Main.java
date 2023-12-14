import addressbook.AddressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBook book = new AddressBook();

        while (true){

            System.out.println("번호를 입력하세요 >>");

            while (true){
                System.out.println("");
                System.out.println("========== 주소록 프로그램 ===============");
                System.out.println("==\t1\t<--\t주소록추가\t\t\t\t\t==");
                System.out.println("==\t2\t<--\t주소록삭제\t\t\t\t\t==");
                System.out.println("==\t3\t<--\t주소록검색(이름)\t\t\t==");
                System.out.println("==\t4\t<--\t주소록검색(주소)\t\t\t==");
                System.out.println("==\t5\t<--\t주소록검색(메모)\t\t\t==");
                System.out.println("==\t6\t<--\t주소록수정\t\t\t\t\t==");
                System.out.println("==========================================");
                System.out.print("메뉴 번호를 입력해주세요 >> ");
                //안정성을 고려해서 스트링으로 받는게 낫지만 일단 인트로 함.
                int menuNumber = sc.nextInt();

                switch (menuNumber){
                    //menu
                    //주소록 추가
                    case 1 -> book.add();

                    //주소록 삭제
                    case 2 -> book.drop();

                    //검색 3 이름
                    case 3 -> book.nameSearch();

                    //검색 4 주소
                    case 4 -> book.addressSearch();

                    //검색 5 메모
                    case 5 -> book.memoSearch();

                    //주소록 수정
                    case 6 -> book.upgrade();
                }
            }
        }
    }
}