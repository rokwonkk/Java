package main;

import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {
        /**
         *  Wrapper class
         *  일반 자료형(char, int..)들을 클래스화 해 놓은 것
         *  String
         *  일반자료형   Wrapper class
         *  boolean     Boolean
         *
         *  byte        Byte
         *  short       Short
         *  int         Integer     ->
         *  long        Long
         *
         *  float       Float
         *  double      Double      ->
         *
         *  char        Character
         *  char[]      String      ->
         *
         */

        Integer iobj = 123;
        System.out.println(iobj);

        iobj = iobj * 2;
        System.out.println(iobj);

        // 숫자 -> 문자열
        //valueOf
        //String str = iobj + "";
        String str = iobj.toString();
        System.out.println(str);

        // 문자열 -> 숫자
        String strNum = "2345";
        int number = Integer.parseInt(strNum);
        System.out.println(number * 2);

        String strDNum = "123.4567";
        double dNumber = Double.parseDouble(strDNum);
        System.out.println(dNumber);

        System.out.println();
        int decimal = 100;
        System.out.println("10진수 100");

        //10진수 -> 2진수
        String binaryString = Integer.toBinaryString(decimal);
        System.out.println("10진수 -> 2진수 " + binaryString);

        //2진수 -> 10진수
        int binaryToDecimal = Integer.parseInt(binaryString, 2);
        System.out.println("2진수 -> 10진수 " + binaryToDecimal);

        //10진수 -> 8진수
        String octal = Integer.toOctalString(decimal);
        System.out.println("10진수 -> 8진수 " + octal);

        //8진수 -> 10진수
        int octalToDecimal = Integer.parseInt(octal, 8);
        System.out.println("8진수 -> 10진수 : " + octalToDecimal); // 10

        //10진수 -> 16진수
        String hexString = Integer.toHexString(decimal);
        System.out.println("10진수 -> 16진수 " + hexString);

        //16진수 -> 10진수
        int hexToDecimal = Integer.parseInt(hexString, 16);
        System.out.println("16진수 -> 10진수 " + hexToDecimal);
    }
}