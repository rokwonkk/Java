package example;

import java.io.*;
import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {

        /**
         *  학생 성적관리 프로그램
         *      과목 : 국어, 영어, 수학 <- Column
         *      이름, 나이, 키, 주소
         *
         *      2차원 배열 -> 10개
         *
         *      메뉴 : Data Access Object(DAO) CRUD
         *              1. 학생정보입력   insert create
         *              2. 학생정보삭제   delete       "", 0
         *              3. 학생정보검색   select  read
         *              4. 학생정보수정   update
         *              //빨리 끝나면
         *              5. 파일저장
         *              6. 파일불러오기
         *
         *              파일 불러오기 후에 추가하고 다시 저장하면 이상한 값들이 추가됨.
         *              확인해서 수정해야함.
         *
         */
        Scanner sc = new Scanner(System.in);
        String student[][] = new String[10][7];

        int count = 0;

        while (true){
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
                    count = insert(student, count);
                    allData(student);
                    break;
                case 2:
                    delete_teacher(student);
                    break;
                case 3:
                    select_teacher(student);
                    break;
                case 4:
                    update_teacher(student);
                    break;
                case 5:
                    save_teacher(student);
                    break;
                case 6:
                    load_teacher();
                    allData(student);
                    break;
            }
        }
    }

    static String[][] load_teacher() {

        File f = new File("/Users/rokwon/fileforder/student.txt");

        String student[][] = new String[10][7];

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            String str = "";
            int count = 0;
            while ((str = br.readLine()) != null){
                String data[] = str.split("-");

                student[count][0] = data[0];
                student[count][1] = data[1];
                student[count][2] = data[2];
                student[count][3] = data[3];
                student[count][4] = data[4];
                student[count][5] = data[5];
                student[count][6] = data[6];

                count++;
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }

    static void save_teacher(String[][] student){
        File f = new File("/Users/rokwon/fileforder/student.txt");

        String strLine[] = new String[student.length];

        for (int i = 0; i < student.length; i++) {
            if (student[i][0] != null && !student[i][0].isEmpty()){
            strLine[i] = student[i][0] + "-"
                       + student[i][1] + "-"
                       + student[i][2] + "-"
                       + student[i][3] + "-"
                       + student[i][4] + "-"
                       + student[i][5] + "-"
                       + student[i][6];
            } else {
                strLine[i] = "";
            }
        }

        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            for (String s : strLine) {
                if(s != null && !s.equals("")) {
                    pw.println(s);
                }
            }
            pw.close();

        } catch (IOException e) {
            System.out.println("파일에 저장되지 않았습니다.");
            e.printStackTrace();
        }

        System.out.println("정상적으로 저장되었습니다.");
    }



    /**
     * 학생 정보 추가
     * @param student
     * @param count
     */
    static int insert(String student[][], int count){
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 정보 입력입니다");

        System.out.print("이름 >> ");
        String name = sc.next();

        System.out.print("나이 >> ");
        int age = sc.nextInt();

        System.out.print("신장 >> ");
        Double height = sc.nextDouble();

        System.out.print("주소 >> ");
        String address = sc.next();

        System.out.print("국어 >> ");
        int lang = sc.nextInt();

        System.out.print("영어 >> ");
        int eng = sc.nextInt();

        System.out.print("수학 >> ");
        int math = sc.nextInt();

        student[count][0] = name;
        student[count][1] = age + "";
        student[count][2] = height + "";
        student[count][3] = address;
        student[count][4] = lang + "";
        student[count][5] = eng + "";
        student[count][6] = math + "";

        count++;

        return count;
    }

    static void delete_teacher(String[][] student){
        Scanner sc = new Scanner(System.in);

        //이름입력
        System.out.print("삭제할 학생의 이름을 입력하세요 >> ");
        String name = sc.next();

        //검색
        int findIndex = search(student, name);

        if (findIndex != -1){
            //찼았음
            student[findIndex][0] = "";
            student[findIndex][1] = "0";
            student[findIndex][2] = "0.0";
            student[findIndex][3] = "";
            student[findIndex][4] = "0";
            student[findIndex][5] = "0";
            student[findIndex][6] = "0";

            System.out.println("정상적으로 삭제됐습니다.");
        } else {
            System.out.println("학생명단에 없습니다");
        }
    }

    static int search(String[][] student, String name) {
        int findIndex = -1;
        for (int i = 0; i < student.length; i++) {
            if(name.equals(student[i][0])){
                //찾았다
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }

    /**
     * 학생 정보 검색
     * @param student
     */
    static void select_teacher(String student[][]){
        Scanner sc = new Scanner(System.in);

        //이름입력
        System.out.print("검색할 학생의 이름을 입력하세요 >> ");
        String name = sc.next();

        //검색
        int findIndex = search(student, name);

        if (findIndex != -1){

            System.out.println("데이터를 찾았습니다.");
            System.out.println("이름은 : " + student[findIndex][0] + "입니다");
            System.out.println("나이는 : " + student[findIndex][1] + "입니다");
            System.out.println("신장은 : " + student[findIndex][2] + "입니다");
            System.out.println("주소는 : " + student[findIndex][3] + "입니다");
            System.out.println("국어 점수는 : " + student[findIndex][4] + "입니다");
            System.out.println("영어 점수는 : " + student[findIndex][5] + "입니다");
            System.out.println("수학 점수는 : " + student[findIndex][6] + "입니다");
            System.out.println();
        } else {
            System.out.println("학생명단에 없습니다");
        }
    }

    static void update_teacher(String student[][]){
        Scanner sc = new Scanner(System.in);

        //이름입력
        System.out.print("수정할 학생 이름을 입력하세요 >> ");
        String name = sc.next();

        //검색
        int findIndex = search(student, name);

        if (findIndex == -1){
            System.out.println("학생명단에 없습니다.");
            return;
        }
        System.out.println();

        System.out.println("현재 국어 점수는 : " + student[findIndex][4] + "입니다");
        System.out.print("바꿀 국어 점수를 입력해주세요 >> ");
        int updateLang = sc.nextInt();
        student[findIndex][4] = updateLang + "";
        System.out.println();

        System.out.println("현재 영어 점수는 : " + student[findIndex][5] + "입니다");
        System.out.print("바꿀 영어 점수를 입력해주세요 >> ");
        int updateEng = sc.nextInt();
        student[findIndex][5] = updateEng + "";
        System.out.println();

        System.out.println("현재 수학 점수는 : " + student[findIndex][6] + "입니다");
        System.out.print("바꿀 수학 점수를 입력해주세요 >> ");
        int updateMath = sc.nextInt();
        student[findIndex][6] = updateMath + "";
        System.out.println();
        System.out.println("바뀐 국어 점수는 : " + student[findIndex][4] + "입니다");
        System.out.println("바뀐 국어 점수는 : " + student[findIndex][5] + "입니다");
        System.out.println("바뀐 국어 점수는 : " + student[findIndex][6] + "입니다");
        System.out.println();
    }

    static void allData(String student[][]){
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                if (student[i][j] != null){
                    System.out.print(student[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}