package example;

import java.io.*;
import java.util.Scanner;

public class Main {
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
         */
        Scanner sc = new Scanner(System.in);
        String student[][] = new String[10][7];

        int count = 1;

        while (true){
            System.out.println("========== 학생정보 프로그램 ==========");
            System.out.println("1.학생정보추가");
            System.out.println("2.학생정보삭제");
            System.out.println("3.학생정보검색");
            System.out.println("4.학생정보수정");
            System.out.println("5.학생정보파일로저장");
            System.out.println("6.학생정보파일불러오기");

            System.out.print("메뉴 번호를 입력해주세요 >> ");
            int menuNumber = sc.nextInt();

            switch (menuNumber){
                case 1:
                    count = insert(student, count);
                    //allData(student);
                    break;
                case 2:
                    delete(student, count);
                    break;
                case 3:
                    select(student, count);
                    break;
                case 4:
                    update(student, count);
                    break;
                case 5:
                    saveList(student);
                    break;
                case 6:
                    loadList();
                    break;
            }
        }
    }

    static void loadList() {
        Scanner sc = new Scanner(System.in);

        System.out.print("불러올 파일명 >> ");
        String loadFileName = sc.next();

        /* 파일 로딩 후 출력 */
        fileLoding(loadFileName);
    }

    static void saveList(String[][] student) {
        Scanner sc = new Scanner(System.in);

        System.out.print("저장할 파일명 >> ");
        String filename = sc.next();

        /* 파일 생성 */
        File f = createFile(filename);
        /* 파일 저장 */
        saveFile(f, student);
    }

    static void fileLoding(String loadFile) {
        String readFile = "";
        File file = new File("/Users/rokwon/fileforder/"+ loadFile +".txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String readStr = "";

            while ((readStr = br.readLine()) != null) {
                if (readStr.trim().length() > 0){
                    readFile += readStr;
                }
                System.out.println(readStr);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 학생 정보 파일 생성한다.
     * @param filename
     * @return
     */
    static File createFile(String filename){
        File file = new File("/Users/rokwon/fileforder/"+filename+".txt");

        try {
            if(file.createNewFile()){
                System.out.println(filename + ".txt 파일 생성 성공했읍니다");
            } else {
                System.out.println(filename + ".txt 파일이 존재합니다");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    /**
     * 현제 작성된 학생 정보들을 txt파일로 저장.
     * @param f
     * @param student
     */
    static void saveFile(File f, String student[][]){
        //파일에 쓰기(save)를 한다
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 1; i < student.length; i++) {
                for (int j = 0; j < student[i].length; j++) {
                    if (student[i][j] != null){
                        pw.print(student[i][j] + "\t");
                    }
                }
                pw.println("");
            }
            pw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
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

    /**
     * 학생 정보 삭제
     * @param student
     * @param count
     */
    static void delete(String[][] student, int count){
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 학생 번호를 입력하세요 >> ");
        count = sc.nextInt();

        student[count][0] = "";
        student[count][1] = "";
        student[count][2] = "";
        student[count][3] = "";
        student[count][4] = "";
        student[count][5] = "";
        student[count][6] = "";

    }

    /**
     * 학생 정보 검색
     * @param student
     * @param count
     */
    static void select(String student[][], int count){
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 학생 번호를 입력하세요 >> ");
        count = sc.nextInt();
        System.out.println();

        System.out.println("이름은 : " + student[count][0] + "입니다");
        System.out.println("나이는 : " + student[count][1] + "입니다");
        System.out.println("신장은 : " + student[count][2] + "입니다");
        System.out.println("주소는 : " + student[count][3] + "입니다");
        System.out.println("국어 점수는 : " + student[count][4] + "입니다");
        System.out.println("영어 점수는 : " + student[count][5] + "입니다");
        System.out.println("수학 점수는 : " + student[count][6] + "입니다");
        System.out.println();

    }

    /**
     * 입력한 학생의 국,영,수 점수 수정
     * @param student
     * @param count
     */
    static void update(String student[][], int count){
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 학생 번호를 입력하세요 >> ");
        count = sc.nextInt();
        System.out.println();

        System.out.println("현재 국어 점수는 : " + student[count][4] + "입니다");
        System.out.println();
        System.out.print("바꿀 국어 점수를 입력해주세요 >> ");
        int updateLang = sc.nextInt();
        student[count][4] = updateLang + "";
        System.out.println();

        System.out.println("현재 영어 점수는 : " + student[count][5] + "입니다");
        System.out.println();
        System.out.print("바꿀 영어 점수를 입력해주세요 >> ");
        int updateEng = sc.nextInt();
        student[count][5] = updateEng + "";
        System.out.println();

        System.out.println("현재 수학 점수는 : " + student[count][6] + "입니다");
        System.out.println();
        System.out.print("바꿀 수학 점수를 입력해주세요 >> ");
        int updateMath = sc.nextInt();
        student[count][6] = updateMath + "";
        System.out.println();
        System.out.println("바뀐 국어 점수는 : " + student[count][4] + "입니다");
        System.out.println("바뀐 국어 점수는 : " + student[count][5] + "입니다");
        System.out.println("바뀐 국어 점수는 : " + student[count][6] + "입니다");
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