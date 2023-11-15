package example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *  임력 -> 숫자 + 문자
         *  암호화, 복호화 함수를 만들자
         */

    // abcdefghijklmnopqrstuvwxyz
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};

        // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String result = "";

        String inputedstr = inputedstr();

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        String enCode = Encoding(inputedstr);

        System.out.println("inputedsrc : " + inputedstr);
        System.out.println("enCode : " + enCode);

        //복호화
        String deCode = Decoding(enCode);

        System.out.println("deCode : " + deCode);

         /** 2차원 배열 -> 1차원 배열로 (함수화) */
         int arr2[][] = {
                 {1,2,3},
                 {4,5,6}
         };

        int arr1[] = Array2toArray(arr2);
        System.out.println(Arrays.toString(arr1));

         /** 2차원 배열 -> 1차원 배열로 (함수화) */
         int arr22[][] = {
                 {11,22,33},
                 {44,55,66},
                 {77,88,99}
         };

        int arr11[] = Array2toArray(arr22);
        System.out.println(Arrays.toString(arr11));

    }

    static String inputedstr() {

        Scanner sc = new Scanner(System.in);

        System.out.print("암호화할 코드를 입력하시오 >> ");

        return sc.next();
    }

    static String Encoding(String str){

        String result = "";

        // abcdefghijklmnopqrstuvwxyz
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};

        // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        //대문자가 들어온 경우

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int n = (int) ch; // 아스키 코드 취득

            //문자의 경우(97 ~ )
            if (n >= 97 && n <= 122){
                n = n - 97;
                result += abcCode[n];
                //숫자의 경우(48 ~ )
            } else if (ch >= 48 && ch <= 57){
                n = n - 48;
                result += numCode[n];
            }
        }
        return result;
    }

    static String Decoding(String result){

        // abcdefghijklmnopqrstuvwxyz
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};

        // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String originalSrc = "";
        for (int i=0; i < result.length(); i++){
            char ch = result.charAt(i);
            int n = (int) ch;

            int index = 0;

            //알파벳인 경우(숫자였던 것)
            if(n >= 97 && n <= 122){
                for (int j=0; j < numCode.length; j++){
                    if(ch == numCode[j]){
                        index = j;
                        break;
                    }
                }
                index = index + 48;
                originalSrc += (char) index;
            }
            //그 외의 경우(알파벳이였던 경우)
            else {

                for (int j=0; j < abcCode.length; j++){
                    if (ch == abcCode[j]){
                        index = j;
                        break;
                    }
                }
                index = index + 97;
                originalSrc += (char) index;
            }
        }
        return originalSrc;
    }

    static int[] Array2toArray(int array2[][]){

        int array[] = new int[ array2.length * array2[0].length ];
        int count = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array[count] = array2[i][j];
                count++;
            }
        }
        return array;
    }
}