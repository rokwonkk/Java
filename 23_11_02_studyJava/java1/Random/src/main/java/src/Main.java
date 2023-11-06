package src;
public class Main {
    public static void main(String[] args) {

        /**
         *  random : 난수, 무작위 <> pattern
         *
         *  1, 2, 3, 4, 5 -> 3, 5
         *
         */
        int rnumber;

        rnumber = (int)(Math.random() * 5);
        System.out.println(rnumber);

        // 0 ~ 9
        rnumber = (int) (Math.random() * 10);
        System.out.println(rnumber);

        // 10 20 30 40 50
        rnumber = ((int) (Math.random() * 5) + 1 ) * 10;
        System.out.println(rnumber);

        // -1 0 1 ,             0 ~ 2
        int x = (int)(Math.random() * 3) - 1;
        int y = (int)(Math.random() * 3) - 1;

        // 3, 7, 9, 12, 21
        int array[] = {3, 7, 9, 12, 21};
        int random = (int)(Math.random() * array.length);
        System.out.println(array[random]);
    }
}