package example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // 한문자씩 쓰기
        //charWrite();

        // 문장으로 쓰기
        strWrite();
    }

    static void strWrite() {

        File file = new File("/Users/rokwon/fileforder/test.txt");

        try{
            /**
             *  추가쓰기 -> FileWriter fw = new FileWriter(file, true);
             *  할일은 별로 없긴 하다.
             */
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw); // -> 저장소에 쓰기
            PrintWriter pw = new PrintWriter(bw);

            //개행 할때 \n 사용하면 되지만 그냥 println 하자.
            pw.print("안녕" + "\n");
            pw.println("하이");
            pw.println("건강하세요");

            /** 원래는 다 닫아야 하지만(PM) pw만 닫아줘도 된다. **/
//            fw.close();
//            bw.close();
            pw.close();

        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    static void oneStr() {
        /**
         *  파일 쓰기 - 파일이 없는 경우, 생성 + 쓰기가 된다.
         */
        File file = new File("/Users/rokwon/fileforder/test.txt");

        try {
            // 한문자씩 쓰기
//            FileWriter fw = new FileWriter(file);
//            fw.write("안녕하세요" + "\n");
//            fw.close();

            //추가쓰기
            FileWriter fw = new FileWriter(file, true);
            fw.write("건강하세요" + "\n");
            fw.close(); // 쓰기를 할땐 반드시 close 해줘야함 안그럼 기록안됨.

        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}