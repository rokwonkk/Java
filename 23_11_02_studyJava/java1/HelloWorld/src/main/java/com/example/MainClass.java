package com.example;
public class MainClass {

    public static void main(String[] args) {
        //Micronaut.run(MainClass.class, args);

        System.out.println("Hello World");
        System.out.println("안녕하세요");
        System.out.println("hello Java");
        System.out.print("world ");
        System.out.println("welcome");
        System.out.println();
        System.out.println("hi");

        System.out.println("문자열"); // 문자열 == String
        System.out.println('A');
        System.out.println('한');
        System.out.println('1');

        System.out.println( 123 );
        System.out.println( 123 + 1 );
        System.out.println("123" + 1);

        //printf -> format
        System.out.printf("%s", "안녕");
        System.out.printf("%d", 1024);
        System.out.printf("%c", 'A');
        System.out.printf("%.2f", 123.456);

        System.out.println();
        // escape sequence
        // \n(개행) \b(백스페이스) \t(띄어쓰기)
        System.out.println("welcom to \nmy world");

        System.out.println("welcome\b");

        System.out.println("홍길동\t 95");
        System.out.println("춘향\t 100");
        System.out.println("일지매\t 90");

        // \" \\
        System.out.println("\"나는 문제없어\" 라고 말했습니다");

        System.out.println("\\ 하이 반가워 \\");

    }
}