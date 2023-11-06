package main;

public class Application {
    public static void main(String[] args) {

        /**
         *  bit operator
         *  lower level, (고급 연산자)
         *  장점 : 처리 속도가 빠르다
         *
         *  bit : 0(false), 1(true)
         *      &(AND),  |(OR),  ^(XOR) -> 보안,  <<(LEFT SHIFT),  >>(RIGHT SHIFT),  ~(NOT)\
         *
         *      1100 1010
         *      C    A
         *
         *      1111 0000
         *      F    0
         */

        /**
         *      //AND
         *      ->
         *      1 | 0 | 1
         *      --|---|---
         *      0 | 0 | 0
         *      --|---|---  ^
         *        | 0 | 1   |
         *
         *      1100 1010
         *      1111 0000
         *      1100 0000
         *      C    0
         */

        int result = 0xCA & 0xF0;
        System.out.println(result);
        System.out.printf("0x%x\n", result);

        /**
         *      //OR
         *      ->
         *      1 | 1 | 1
         *     ---|---|---
         *      0 | 0 | 1
         *     ---|---|---  ^
         *        | 0 | 1   |
         *
         *      1100 1010
         *      1111 0000
         *      1111 1010
         *      F    A
         */
        int result2 = 0xCA | 0xF0;
        System.out.println(result);
        System.out.printf("0x%x\n", result2);

        /**
         *      //XOR
         *      ->
         *      1 | 1 | 0
         *     ---|---|---
         *      0 | 0 | 1
         *     ---|---|---  ^
         *        | 0 | 1   |
         *
         *      1100 1010
         *      1111 0000
         *      0011 1010
         *      3    A
         *      1100 1010               -> 중요 데이터
         *      1111 0000               -> key
         *      0011 1010 -> 결과       -> 암호화
         *      1111 0000 -> 다시 연산  -> key
         *      1100 1010 -> 원상 복귀  -> 복호화
         *
         */
        int result3 = 0xCA ^ 0xF0;
        System.out.println(result);
        System.out.printf("0x%x\n", result3);

        //Left Shift * 2
        byte by1;
        by1 = 0x1 << 2;
        System.out.println(by1);

        //Right Shift / 2
        byte by2;
        by2 = 0x1 << 2;
        System.out.println(by2);

        // ~        0->1, 1->0
        byte by3 = ~0x2a;                   // 0010 1010
                                            // 1101 0101
        System.out.printf("0x%x", by3);     // D    5
    }
}