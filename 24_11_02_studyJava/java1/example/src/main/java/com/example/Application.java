package com.example;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("과제 1");
        System.out.println();
        System.out.println("=====================================================================");
        System.out.println("|\t이름\t\t\t나이\t\t\t전화번호\t\t\t\t주소\t|");
        System.out.println("=====================================================================");
        System.out.println("|\t홍길동\t\t\t20\t\t\t\t010-1111-2222\t\t\t경기도\t|");
        System.out.println("|\t일지매\t\t\t18\t\t\t\t02-123-4567\t\t\t\t서울\t|");
        System.out.println("=====================================================================");
        System.out.println();
        System.out.println(" -------------------------------------------------------------------- ");
        System.out.println();
        System.out.println("과제 2");
        System.out.println();
        System.out.println("=====================================================================");
        System.out.println("\\\t이름\t\t\t나이\t\t\t전화번호\t\t\t\t주소\t\\");
        System.out.println("=====================================================================");
        System.out.println("\\\t홍길동\t\t\t20\t\t\t\t010-1111-2222\t\t\t경기도\t\\");
        System.out.println("\\\t일지매\t\t\t18\t\t\t\t02-123-4567\t\t\t\t서울\t\\");
        System.out.println("=====================================================================");
        System.out.println();
        System.out.println(" -------------------------------------------------------------------- ");


        String name = "name";
        String name1 = "홍길동";
        String name2 = "일지매";
        String name3 = "장옥정";

        String age = "age";
        int age1 = 20;
        int age2 = 18;
        int age3 = 14;

        String man = "man";
        boolean man1 = true;
        boolean man2 = true;
        boolean woman = false;

        String phone = "phone";
        String call1 = "010-1111-2222";
        String call2 = "02-123-4567";
        String call3 = "02-345-7890";

        String height = "height";
        double height1 = 175.12;
        double height2 = 180.01;
        double height3 = 155.78;

        String address = "address";
        String address1 = "경기도";
        String address2 = "서울";
        String address3 = "부산";

        System.out.println();
        System.out.println("과제 3");
        System.out.println();
        System.out.println("=============================================================================================");
        System.out.println("\\\t"+name+"\t\t\t"+age+"\t\t\t"+man+"\t\t\t"+phone+"\t\t\t\t"+height+"\t\t\t"+address+"\t\t\\");
        System.out.println("=============================================================================================");
        System.out.println("\\\t\""+name1+"\"\t\t"+age1+"\t\t\t"+man1+"\t\t"+call1+"\t\t"+height1+"\t\t\t\""+address1+"\"\t\\");
        System.out.println("\\\t\""+name2+"\"\t\t"+age2+"\t\t\t"+man2+"\t\t"+call2+"\t\t\t"+height2+"\t\t\t\""+address2+"\"\t\t\\");
        System.out.println("\\\t\""+name3+"\"\t\t"+age3+"\t\t\t"+woman+"\t\t"+call3+"\t\t\t"+height3+"\t\t\t\""+address3+"\"\t\t\\");
        System.out.println("=============================================================================================");
        System.out.println();
        System.out.println(" ----------------------------------------------------------------------------------- ");
        System.out.println();
        System.out.println("과제 4");
        System.out.println();

        int x = 1;
        int y = 2;
        int temp;

        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + " y = " + y);

        System.out.println();
        System.out.println(" ----------------------------------------------------------------------------------- ");
        System.out.println();
    }
}