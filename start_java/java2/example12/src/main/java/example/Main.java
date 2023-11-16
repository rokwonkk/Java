package example;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         *  example1
         *  파일명을 입력 받고 파일을 생성한다.
         *  3명의 학생의 이름을 입력 받고 파일에 쓰기를 한다.
         *  그리고 3명의 학생의 이름을 파일로 부터 읽어 드리고 콘솔에 출력하라.
         */
//        example1();

        File file = new File("/Users/rokwon/fileforder/data.txt");

        String str = " ,이름,나이,주소,1,홍길동,24,서울시,2,성춘향,16,남원시,3,일지매,22,부산시";

        String[] data = str.split(",");
        String[][] newdata = new String[4][4];

        int count = 0;
        for (int i = 0; i < newdata.length; i++) {
            for (int j = 0; j < newdata[i].length; j++) {
                newdata[i][j] = data[count];
                count++;
            }
        }

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 0; i < newdata.length; i++) {
                for (int j = 0; j < newdata[i].length; j++) {
                    pw.print(newdata[i][j] + "\t");
                }
                pw.println("");
            }
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         *  파일 읽는 부분
         */
        String readData = "";

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String readStr = "";

            while ((readStr = br.readLine()) != null) {
                if (readStr.trim().length() > 0){
                    readData += readStr;
                }
                System.out.println(readStr);
            }
            br.close();

            int sum = 0;
            String[] readDataSplit = readData.split("\t");
            for (int i = 6; i < readDataSplit.length; i=i+4) {
                sum += Integer.parseInt(readDataSplit[i]);
            }
            System.out.println("나이의 총 합은 " +sum+"세 입니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void example1() {

        Scanner sc = new Scanner(System.in);

        System.out.print("사용하실 파일명을 적어주세요 >> ");
        String filename = sc.next();

        File file = new File("/Users/rokwon/fileforder/"+filename+".txt");

        try {
            if(file.createNewFile()){
                System.out.println("파일 생성 성공");
            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
           e.printStackTrace();
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw); // -> 저장소에 쓰기
            PrintWriter pw = new PrintWriter(bw);

            String studentName = "";
            for (int i = 0; i < 3; i++) {
                System.out.print((i+1)+"번째 학생의 이름을 입력하세요 >> ");
                studentName = sc.next();
                pw.println(studentName);
            }
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String str = "";

            int count = 1;
            while ((str = br.readLine()) != null){
                System.out.println(count+"번째 학생 : "+ str);
                count++;
            }
            br.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}