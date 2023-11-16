package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *  NullPointerException
         *  배열이 null
         *  가장 많이 보게되는 예외
         */
        try {
            NullPointerException();
        } catch (Exception e){
            System.out.println("애러를 전달 받았음.");
            System.out.println("넌 무슨 애러니? " + e);
        }

        /**
         *  NullPointerException
         *  배열이 null
         *  가장 많이 보게되는 예외
         */
        int array[] = null; // 0x34323454 -> 0x00000000

        try{
            System.out.println(array.length);
        } catch (NullPointerException e){
            System.out.println("1. 정확한 표현 -> 동적확보 되지 않음 ");
            System.out.println("1. null인데 length가 있겠냐?");
        }

        /**
         *  ArrayIndexOutOfBountdsException
         *  배열 범위 초과
         */
        int array1[] = {1, 2, 3};

        try {
            System.out.println(array1[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2. 배열 범위 초과요");
            System.out.println("2. 배열에 0,1,2를 넣어놓고 3을 찾아라하는데 찾아지겠니?");
        }

        /**
         *  FileNotFoundException
         *  파일을 찾을 수 없을 때
         *  파일 입출력을 쓰면 무조건 걸어줘야함
         */
        File file = new File("c:\\xxx.txt");
        FileInputStream is;

        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e){
            System.out.println("3. 파일을 찾을 수 없어요.");
            System.out.println("3. 경로에 파일 있는지 확인좀;");
        }

        /**
         *  NumberFormatException
         *  형태가 다를 때
         */
        int num;

        try {
            num = Integer.parseInt("123.456");
        } catch (NumberFormatException e){
            System.out.println("4. 숫자 형태가 다른데?");
            System.out.println("4. 숫자 형태좀 맞춰라 넌 int로 만들어놓고 왜 Double로 집어넣냐?");
        }

        /**
         *  InputMismatchException
         *  정수로 입력해야 하는데 문자를 입력할 때
         */
        Boolean out = true;
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("number : ");
                int number = sc.nextInt();
                System.out.println("입력후 실행");
                out = true;
            } catch (InputMismatchException e) {
                System.out.println("5. 숫자가 아닌데?");
                out = false;
            }catch (Exception e){
                e.fillInStackTrace();
            }
            if (out){
                break;
            }
        }

        /**
         *  StringIndexOutOfBoundsException
         *  문자열의 길이가 초과했을 때
         */
        String str = "abc";

        try {
            str.charAt(3);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("6. 문자열의 길이 초과인뎅?");
        }

    }

    static void NullPointerException() throws NullPointerException{
        int array[] = null; // 0x34323454 -> 0x00000000

        //애러가 날 코드
        System.out.println(array.length);
    }
}