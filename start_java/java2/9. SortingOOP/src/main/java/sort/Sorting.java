package sort;

import java.util.Scanner;

public class Sorting {
    // Sorting
    // 선언부
    private int number[];
    private boolean updown;

    public void input(){

        Scanner sc = new Scanner(System.in);

        // 입력
        // 몇개를 정렬?
        System.out.print("정렬할 수의 갯수 = ");
        int count = sc.nextInt();

        number = new int[count];
        // 숫자들을 입력
        for(int i = 0;i < number.length; i++) {
            System.out.print((i + 1) + "번째 = ");
            number[i] = sc.nextInt();
        }

        //	오름/내림
        System.out.print("오름(1)/내림(2) = ");
        int ud = sc.nextInt();
        if(ud == 1)		updown = true;
        else			updown = false;
    }

    public void sorting(){
        //	오름/내림
        for(int i = 0;i < number.length - 1; i++) {
            for(int j = i+1; j < number.length; j++ ) {
                if(updown) {	// 오름
                    if(number[i] > number[j]) {
                        swapUpgrage(i, j);
                    }
                } else {			// 내림
                    if(number[i] < number[j]) {
                        swapUpgrage(i, j);
                    }
                }
            }
        }
    }

    private void swapUpgrage(int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }

    public void print(){
        String message = "";
        if(updown)	message = "오름차순 정렬입니다";
        else		message = "내림차순 정렬입니다";
        System.out.println(message);

        for(int i = 0;i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}


