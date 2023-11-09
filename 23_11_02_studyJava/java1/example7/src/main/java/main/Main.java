package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //example22();
        //example22_1();
        //example23();
        //example23_1();
        //example24();
        //example24_1();
        //example25();
        //example25_1();
        //example26();
        //example26_1();
        example26_2();
    }

    static void example22() {
        System.out.println("과제 22");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("1 ~ 100사이의 값을 10개 입력하시오 " + (i+1) + "/10 ");
            arr[i] = sc.nextInt();
        }

        int maxvalue = arr[0]; //최대값
        for (int i = 1; i < arr.length; i++) {
            if (maxvalue < arr[i]) {
                maxvalue = arr[i];
            }
        }

        int minvalue = arr[0]; //최소값
        for (int i = 1; i < arr.length; i++) {
            if (minvalue > arr[i]) {
                minvalue = arr[i];
            }
        }

        System.out.println("최대값 : " + maxvalue + "\t최소값 : " + minvalue);
        System.out.println();
    }

    static void example22_1() {
        // 1 ~ 100 사이의 10개의 수를 입력 받아서
        // 최소 값과 최대 값을 출력하는 프로그램을 작성하시오

        Scanner sc = new Scanner(System.in);

		int number[] = new int[10];

		for(int i = 0;i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}

		// 최대값  { 3, 2, 4, 1, 5 }	max = 3
		int max = number[0];
		for(int i = 1;i < number.length; i++) {
			if(max < number[i]) {
				max = number[i];	// max보다 큰 값으로 갱신
			}
		}
		System.out.println("최대값:" + max);

		// 최소값
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if(min > number[i]) {
				min = number[i];
			}
		}
		System.out.println("최소값:" + min);

    }

    static void example23() {
        System.out.println("과제 23");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int avgscore = 0; // 평균 점수
        int arr[][] = new int[5][3];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0; // 점수 총합
            System.out.println((i + 1) + "번째 학생");
            for (int j = 0; j < arr[i].length; j++) {

                System.out.println("국어,수학,영어 점수를 차례대로 입력하세요 : ");
                int value = sc.nextInt();

                if (j == 0) System.out.println("국어점수 : " + value);
                if (j == 1) System.out.println("수학점수 : " + value);
                if (j == 2) System.out.println("영어점수 : " + value);

                arr[i][j] = value;
                sum += arr[i][j];
                avgscore = sum / arr[i].length;
            }

            System.out.println("점수 총 합 : " + sum);
            System.out.println("점수 평균 : " + avgscore);
            if (avgscore >= 80) {
                System.out.println((i + 1) + "번 학생은 합격입니다");
            } else if (avgscore < 60) {
                System.out.println((i + 1) + "번 학생은 불합격입니다");
            } else {
                System.out.println((i + 1) + "번 학생은 재시험응시자입니다");
            }
            System.out.println();
        }
    }
    static void example23_1() {

        Scanner sc = new Scanner(System.in);

        //	int student[][] = new int[5][3];
        int student[][] = {
                {100, 90, 80},
                {60, 50, 65},
                {70, 45, 50},
                {100, 40, 75},
                {90, 90, 85},
        };

        double avg[] = new double[5];
		for(int i = 0;i < student.length; i++) {
			// 입력
			System.out.print("국어 = ");
			int lang = sc.nextInt();
			System.out.print("영어 = ");
			int eng = sc.nextInt();
			System.out.print("수학 = ");
			int math = sc.nextInt();

			// 저장
			student[i][0] = lang;
			student[i][1] = eng;
			student[i][2] = math;
		}

//		String title[] = { "국어", "영어", "수학" };
//		for(int i = 0;i < student.length; i++) {
//			System.out.println((i + 1) + "번째 학생의 점수 >> ");
//			for(int j = 0;j < title.length; j++) {
//				System.out.print(title[j] + " = ");
//				int chap = sc.nextInt();
//				student[i][j] = chap;
//			}
//		}

        // 1. 방법
        // 합격/불합격 판정
		for(int i = 0;i < student.length; i++) {
			int sum = student[i][0] + student[i][1] + student[i][2];
			avg[i] = (double)sum / student[i].length;

			System.out.print("평균점수는 " + avg[i] + "점으로 ");
			if(avg[i] >= 80) {
				System.out.println((i + 1) + "번 학생은 합격입니다");
			}
			else if(avg[i] < 60){
				System.out.println((i + 1) + "번 학생은 불합격입니다");
			}
			else {
				System.out.println((i + 1) + "번 학생은 재시험을 응시하세요");
			}
		}

		// 2. 방법
		// 평균 점수 구하기
		for(int i = 0;i < student.length; i++) {
			int chapsum = 0;
			for (int j = 0; j < student[i].length; j++) {
				chapsum = chapsum + student[i][j];
			}
			avg[i] = (double)chapsum / student[i].length;
		}

		// 합격/불합격 판정
		for(int i = 0;i < student.length; i++) {
			System.out.print("평균점수는 " + avg[i] + "점으로 ");
			if(avg[i] >= 80) {
				System.out.println((i + 1) + "번 학생은 합격입니다");
			}
			else if(avg[i] < 60){
				System.out.println((i + 1) + "번 학생은 불합격입니다");
			}
			else {
				System.out.println((i + 1) + "번 학생은 재시험을 응시하세요");
			}
		}
    }

    static void example24() {
        System.out.println("과제 24");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해 주십시오 : ");
        String value = sc.next();

        boolean isNumber = value.matches("[+-]?\\d*(\\.\\d+)?");
        if (isNumber) {
            System.out.println("모두 숫자입니다.");
        } else {
            System.out.println("모두 숫자가 아닙니다");
        }
    }

    static void example24_1() {
		// 문자열을 입력받고, 입력받은 문자열이 모두 숫자로 되어 있는지 메시지로 출력하시오.
        Scanner sc = new Scanner(System.in);

		System.out.print("입력 = ");
		String numStr = sc.next();

		boolean isNumber = true;
		for(int i = 0;i < numStr.length(); i++) {
		//	System.out.println(numStr.charAt(i));
			int num = (int)numStr.charAt(i);
			if(num < 48 || num > 57) {
				isNumber = false;
				break;
			}
		}

		if(isNumber) {
			System.out.println("모두 숫자로 되어 있습니다");
		}
		else {
			System.out.println("문자가 포함되어 있습니다");
		}
    }

    static void example25() {
        System.out.println("과제 25");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("첫 번째 값 입력 >> ");
            int value = sc.nextInt();
            System.out.println("입력하신 정수 1은 : " + value + "입니다.");

            System.out.print("두 번째 값 입력 >> ");
            int value2 = sc.nextInt();
            System.out.println("입력하신 정수 2는 : " + value2 + "입니다.");

            System.out.print("(+, -, *, /) 중 하나를 입력 >> ");
            String operator = sc.next();
            switch (operator) {
                case "+" -> System.out.println(value + " + " + value2 + " = " + (value + value2));
                case "-" -> System.out.println(value + " - " + value2 + " = " + (value - value2));
                case "*" -> System.out.println(value + " * " + value2 + " = " + (value * value2));
                case "/" -> System.out.println(value + " / " + value2 + " = " + (value / value2));
                default -> {
                    System.out.println("연산자가 잘못 입력되었습니다.");
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            System.out.println("다시입력하십시오");
            example25();
        }
    }

    static void example25_1() {

        Scanner sc = new Scanner(System.in);

		int number1 = 0;

		while(true) {
			System.out.print("첫번째 수 = ");
			String numStr1 = sc.next();

			// 숫자인지 검사
			boolean isNum = true;
			for (int i = 0; i < numStr1.length(); i++) {
				int n = numStr1.charAt(i);
				if(n < 48 || n > 57) {
					isNum = false;
					break;
				}
			}

			// 문자열 -> 숫자
			if(isNum) {	// 정상적으로 숫자가 입력된 경우
				number1 = Integer.parseInt(numStr1);
				break;
			}

			System.out.println("정확히 숫자를 입력해 주십시오");
		}


	//	int number1 = sc.nextInt();

		System.out.print("(+, -, *, /) = ");
		String oper = sc.next();

		System.out.print("두번째 수 = ");
		int number2 = sc.nextInt();

		// calculator
		int result = 0;
		switch(oper) {
			case "+":
				result = number1 + number2;
				break;
			case "-":
				result = number1 - number2;
				break;
			case "*":
				result = number1 * number2;
				break;
			case "/":
				result = number1 / number2;
				break;
		}
//		if(oper.equals("+")) {
//
//		}

		// print
		System.out.println(number1 + " " + oper + " " + number2 + " = " + result);
    }

    static void example26() {
        // 2차원 배열을 1차원 배열에 제어 문을 이용하여 저장하고 출력하라.

        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int col = arr.length;
        int row = arr[0].length;

        int arr1[] = new int[col * row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr1[i * arr[0].length + j] = arr[i][j];
            }
        }

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    static void example26_1() {
        // 2차원 배열을 1차원 배열에 제어 문을 이용하여 저장하고 출력하라.
        Scanner sc = new Scanner(System.in);

        char array2[][] = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
                {'J', 'K', 'L'}
        };

        char array1[] = new char[array2.length * array2[0].length];
        System.out.println(array1.length);

        /**                   i   j
         *  array[0][0] A 3 * 0 + 0 -> 0
         *  array[0][1] B 3 * 0 + 1 -> 1
         *  array[0][2] C 3 * 0 + 2 -> 2
         *  array[1][0] D 3 * 1 + 0 -> 3
         *  array[1][1] E 3 * 1 + 1 -> 4
         *  array[1][2] F 3 * 1 + 2 -> 5
         */

//        for (int i=0; i < array2.length; i++){
//            for (int j=0; j < array2[i].length; j++){
//                array1[array2[i].length * i + j] =array2[i][j];
//            }
//        }

        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array1[count] = array2[i][j];
                count++;
            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    static void example26_2() {
        //섞어서 짜봤다.

        int row, col;
        int[][] arr2 = new int[3][4];

        Scanner sc = new Scanner(System.in);

        System.out.print("생성할 배열의 행을 입력 : ");
        row = sc.nextInt();
        System.out.print("생성할 배열의 열을 입력 : ");
        col = sc.nextInt();

        int arr1[] = new int [arr2.length * arr2[0].length];

        int count = 0;
        for(int i = 0; i < row; ++i) {
            for(int j = 0; j < col; ++j) {
                System.out.print(i + "행 "+ j +"열 "+"값 입력 >> ");
                arr2[i][j] = sc.nextInt();

                arr1[count] = arr2[i][j];
                count++;
            }
        }

        System.out.println();
        System.out.println("2차원 배열 : ");
        for(int i=0; i < row; ++i) {
            for(int j=0; j < col; ++j) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println(); //줄바꿈
        }

        System.out.println();
        System.out.print("1차원 배열 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
