package Addressbook;

import Addressbook.dta.MemberDao;
import Addressbook.dta.MemberDaoImpl;
import Addressbook.file.FileIO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MemberDao dao = new MemberDaoImpl();

        //menu
        while (true){
            System.out.println("");
            System.out.println("========== 주소록 프로그램 ===============");
            System.out.println("==\t1\t<--\t주소록추가\t\t\t\t\t==");
            System.out.println("==\t2\t<--\t주소록삭제\t\t\t\t\t==");
            System.out.println("==\t3\t<--\t주소록검색\t\t\t\t\t==");
            System.out.println("==\t4\t<--\t주소록정보수정\t\t\t\t==");
            System.out.println("==\t5\t<--\t주소록모두출력\t\t\t\t==");
            System.out.println("==\t6\t<--\t주소록파일로저장\t\t\t==");
            System.out.println("==\t7\t<--\t주소록파일불러오기\t\t\t==");
            System.out.println("==========================================");
            System.out.print("메뉴 번호를 입력해주세요 >> ");
            //안정성을 고려해서 스트링으로 받는게 낫지만 일단 인트로 함.
            int menuNumber = sc.nextInt();

            switch (menuNumber){
                case 1:
                    dao.insert();
                    break;
                case 2:
                    dao.delete();
                    break;
                case 3:
                    dao.select();
                    break;
                case 4:
                    dao.update();
                    break;
                case 5:
                    dao.allData();
                    break;
                case 6:
                    FileIO.save("addressbook");
                    break;
                case 7:
                    FileIO.load("addressbook");
                    break;
            }
        }
    }
}