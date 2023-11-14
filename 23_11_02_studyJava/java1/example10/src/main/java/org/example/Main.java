package org.example;

public class Main {
    public static void main(String[] args) {

        /**
         *  배열의 값에 *2배의 연산된 값이 산출되도록 메소드를 작성
         */

//        int num1[] = {1, 2, 3, 4, 5};
//        getDouble(num1);
//        System.out.print("num1 [] = ");
//        for (int i = 0; i < num1.length; i++) {
//            System.out.print(num1[i]+ " ");
//        }

        /**
         * 두수를 나눗셈 연산으로 몫과 나머지를 구하는 메소드를 작성
         */

        int num1 = 10000;
        int num2 = 500;
        int result = 0, tag[] = new int[1];

        result = getResult(num1, num2, result, tag);
        System.out.println("몫 = " + result + " 나머지 = " + tag[0]);

        /**
         *  두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
         */
//        System.out.println(getDistance(1,1,2,2));

        /**
         *  메소드명 : shuffle
         *  기능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
         *  처리한 배열을 반환한다
         */
//        int original[] = { 100, 400, 500, 600, 300, 200 };
//        System.out.println(Arrays.toString(original));
//        int[] result = shuffle(original);
//        System.out.println(Arrays.toString(result));

        /**
         *  메소드명 : max
         *  기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
         *  만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
         *  반환타입 : int
         *  매개변수 : int[] arr - 최대값을 구할 배열
         */
//        int[] data = {1,7,5,4,100};
//        System.out.println(Arrays.toString(data));
//        System.out.println("최대값 : " + max(data));

        /**
         * 메소드명 : isNumber
         * 기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
         * 모두 숫자로만 이루어져 있으면 true를 반환하고,
         * 그렇지 않으면 false를 반환한다.
         * 만일 주어진 문자열이 Null이거나 빈 문자열 "" 이라면 false를 반환한다.
         * 반환타입 : boolean
         * 매개변수 : String str - 검사할 문자열
         */
//        String str = "122a361451235123412a34";
//        System.out.println(str+"는 숫자입니까? " + isNumber(str));
//        str = "5551231a124asda1223";
//        System.out.println(str+"는 숫자입니까? " + isNumber(str));
    }

    static void getDouble(int[] num1) {
        for (int i = 0; i < num1.length; i++){
            num1[i] += num1[i];
        }
    }

    static int getResult(int num1, int num2, int result, int[] tag) {
        result = num1 / num2;
        tag[0] = num1 % num2;

        return result;
    }

    static double getDistance(int x, int y, int x1, int y1) {
        // Math.pow() -> 제곱
        // Math.sqrt() -> 루트
        double d;
        int xd, yd;
        yd = (int) Math.pow((y1-y),2);
        xd = (int) Math.pow((x1-x),2);
        d = Math.sqrt(yd+xd);
        return d;
    }

    static int[] shuffle(int[] original) {
        int temp, temp2;
        //변수 길이 만큼 돌려주고
        for (int i = 0; i < original.length; i++){
            int randomnum1 = (int)(Math.random() * original.length);
            temp = original[randomnum1];
            int randomnum2 = (int)(Math.random() * original.length);
            temp2 = original[randomnum2];

            original[randomnum1] = temp2;
            original[randomnum2] = temp;
        }
        return original;
    }

    static int max(int[] data) {

        if (data.length == 0){
            return -99999;
        }

        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]){
                max = data[i];
            }
        }
        return max;
    }

    static Boolean isNumber(String str) {
        boolean b = true;
        for (int i=0; i<str.length();i++){
            int c = str.charAt(i);

            if(c < 48 || c > 57){
                b = false;
                break;
            }
        }
        return b;
    }
}