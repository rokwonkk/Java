package baseball;

import baseball.Dao.BaseballDao;
import baseball.Dao.BaseballDaoImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BaseballDao dao = new BaseballDaoImpl();

        //menu
        while (true){
            System.out.println("");
            System.out.println("========== 야구 팀 정보 프로그램 =============");
            System.out.println("==\t1\t<--\t선수정보추가\t\t\t\t\t==");
            System.out.println("==\t2\t<--\t선수정보삭제\t\t\t\t\t==");
            System.out.println("==\t3\t<--\t선수정보검색\t\t\t\t\t==");
            System.out.println("==\t4\t<--\t선수전체정보\t\t\t\t\t==");
            System.out.println("==\t5\t<--\t선수정보수정\t\t\t\t\t==");
            System.out.println("==\t6\t<--\t타율순위\t\t\t\t\t\t==");
            System.out.println("==\t7\t<--\t방어율순위\t\t\t\t\t\t==");
            System.out.println("==\t8\t<--\t선수정보파일로저장\t\t\t\t==");
            System.out.println("==\t9\t<--\t선수정보파일불러오기\t\t\t==");
            System.out.println("==============================================");
            System.out.print("메뉴 번호를 입력해주세요 >> ");
            //안정성을 고려해서 스트링으로 받는게 낫지만 일단 인트로 함.
            int menuNumber = sc.nextInt();

            switch (menuNumber){
                case 1:
                    dao.insertPlayer();
                    break;
                case 2:
                    dao.deletePlayer();
                    break;
                case 3:
                    dao.selectPlayer();
                    break;
                case 4:
                    dao.allData();
                    break;
                case 5:
                    dao.updatePlayer();
                    break;
                case 6:
                    dao.batAvgDesc();
                    break;
                case 7:
                    dao.defenceDesc();
                    break;
                case 8:
                    dao.save();
//                    dao.saveAnother();
                    break;
                case 9:
                    dao.load();
//                    dao.loadAnother();
                    break;
            }
        }
    }
}






