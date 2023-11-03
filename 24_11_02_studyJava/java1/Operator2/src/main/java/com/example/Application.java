package com.example;

public class Application {
    public static void main(String[] args) {

        /**
         *  논리 연산자(true or false)
         *
         *  &&  (and)   a 그리고 b
         *  ||  (or)    a 또는 b
         *  !   (not)   ...아닌
         *
         *  논리 연산자는 제어문(if, while)과 같이 사용하는 경우가 많다.
         *  비교 연산자 -> 크다(<) 작다(>) 크거다같다(<=) 작거나같다(<=) 같다(==)
         *
         */

        /**
         *  AND
         *  false false -> false
         *  true false -> false
         *  false true -> false
         *  true true -> true
         */
        int number = 0;
        System.out.println("AND");
        System.out.println(number >= 0 && number < 10);
        System.out.println(number > 0 && number < 10);

        /**
         *  OR
         *  false false -> false
         *  true false -> true
         *  false true -> true
         *  true true -> true
         */
        System.out.println();
        System.out.println("OR");
        System.out.println(number >= 0 || number < 10);
        System.out.println(number < 0 || number > 10);

        /**
         *  NOT
         *  false -> true
         *  true -> false
         */
        System.out.println();
        System.out.println("NOT");
        System.out.println(number == 0);
        System.out.println(number != 0);
        System.out.println(number != 10);
        System.out.println(number == 10);

        System.out.println( !(number > -5 && number < 0) );
        System.out.println( number <= -5 || number >= 0 );

        System.out.println( !(number > 5) );

    }
}