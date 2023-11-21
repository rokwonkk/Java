package student;

import student.Dao.StudentDao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDao dao = new StudentDao();

        //menu
        while (true){
            System.out.println("");
            System.out.println("========== 학생정보 프로그램 ==========");
            System.out.println("1.학생정보추가");
            System.out.println("2.학생정보삭제");
            System.out.println("3.학생정보검색");
            System.out.println("4.학생정보수정");
            System.out.println("5.학생정보파일로저장");
            System.out.println("6.학생정보파일불러오기");
            System.out.println();
            System.out.print("메뉴 번호를 입력해주세요 >> ");
            int menuNumber = sc.nextInt();

            switch (menuNumber){
                case 1:
                    dao.insert();
                    dao.allData();
                    break;
                case 2:
                    dao.delete();
                    dao.allData();
                    break;
                case 3:
                    dao.select();
                    dao.allData();
                    break;
                case 4:
                    dao.update();
                    dao.allData();
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
}