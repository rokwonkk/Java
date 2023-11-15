package example;

public class Main {
    public static void main(String[] args) {

        /**
         *  임력 -> 숫자 + 문자
         *  암호화, 복호화 함수를 만들자
         *
         *  빨리 끝나면
         *  2차원 배열 -> 1차원 배열로 (함수화)
         */

    // abcdefghijklmnopqrstuvwxyz
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};

        // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "rokwon222kkk";
        String result = "";
        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);
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

        System.out.println("src:"+src);
        System.out.println("result:"+result);

        //복호화
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
        System.out.println("복호화된 코드 : " + originalSrc);
    }

    }
}