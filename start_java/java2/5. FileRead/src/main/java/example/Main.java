package example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /**
         *  파일 읽기
         */

        //한문자씩 읽음
        //charRead();

        //문장으로 읽음
        strRead();
    }

    static void strRead() {
        File file = new File("/Users/rokwon/fileforder/test.txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String str = "";

            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void charRead() {
        File file = new File("/Users/rokwon/fileforder/test.txt");

        try {

            //파일을 읽었다.
            FileReader fr = new FileReader(file);

            //한글자씩 읽은 값을 담을 곳
            String str = "";

            //한글자씩 읽는다.
            int c = fr.read();

            //글자를 다 읽었을 때
            while (c != -1){

                System.out.println((char) c);
                //값 담을 곳에 넣어준다. 스트링으로 받아야해서 강제로 형 변환함.
                str = str + (char) c;
                c = fr.read();

            }
            fr.close();

            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}