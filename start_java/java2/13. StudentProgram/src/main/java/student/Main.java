package student;

import student.Dao.StudentDaoImpl;
import student.Dao.StudentDao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        StudentDao dao = new StudentDao();
        StudentDao dao = new StudentDaoImpl();

        //menu
        while (true){
            System.out.println("");
            System.out.println("========== 학생정보 프로그램 =============");
            System.out.println("==\t1\t<--\t학생정보추가\t\t\t\t\t==");
            System.out.println("==\t2\t<--\t학생정보삭제\t\t\t\t\t==");
            System.out.println("==\t3\t<--\t학생정보검색\t\t\t\t\t==");
            System.out.println("==\t4\t<--\t학생정보수정\t\t\t\t\t==");
            System.out.println("==\t5\t<--\t학생정보모두출력\t\t\t\t==");
            System.out.println("==\t6\t<--\t학생정보파일로저장\t\t\t\t==");
            System.out.println("==\t7\t<--\t학생정보파일불러오기\t\t\t==");
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
                    dao.save();
                    //dao.save_teacher();
                    break;
                case 7:
                    dao.load();
                    //dao.load_teacher();
                    break;
            }
        }
    }
}