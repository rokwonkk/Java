package main;

public class Main {
    public static void main(String[] args) {

        /**
         *  2차원 배열
         *  1차원 배열을 확장한 배열
         *
         *  int array[] = {1, 2, 3, 4, 5};
         *  int array[] = new int[5];
         *  array[0] = 1;
         *  array[1] = 2;
         *  array[2] = 3;
         *  array[3] = 4;
         *  array[4] = 5;
         *
         *  int array2[][] = new int[3][4];
         *  int []array2[] = new int[3][4];
         *  int [][]array2 = new int[3][4];
         *  array2[0][0] = 1;
         *
         *  int array2[][] = {
         *      {1,2,3,4},
         *      {5,6,7,8},
         *      {9,10,11,12}
         *  }
         */

        int array2[][] = new int[3][4];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[0][3] = 4;
        array2[1][0] = 5;
        array2[1][1] = 6;
        array2[1][2] = 7;
        array2[1][3] = 8;
        array2[2][0] = 9;
        array2[2][1] = 10;
        array2[2][2] = 11;
        array2[2][3] = 12;

//        int array2[][] = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12}
//        };

        int array3[][] = new int [3][];
        int arr01[] = {1, 2, 3, 4};
        array3[0] = arr01;

        int arr02[] = {5, 6, 7};
        array3[1] = arr02;

        int arr03[] = {8, 9};
        array3[2] = arr03;

        System.out.println(array3.length);
        System.out.println(array3[0].length);
        System.out.println(array3[1].length);
        System.out.println(array3[2].length);

    }
}