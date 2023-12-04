package Queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue(5);

        String peek = (String) queue.peek();

        String str = "AAA";
        queue.push(str);

        peek = (String) queue.peek();
        System.out.println(peek);

        str = "BBB";
        queue.push(str);

        peek = (String) queue.peek();
        System.out.println(peek);

        str = "CCC";
        queue.push(str);

        peek = (String) queue.peek();
        System.out.println(peek);

        queue.pop();

        peek = (String) queue.peek();
        System.out.println(peek);

        queue.pop();

        peek = (String) queue.peek();
        System.out.println(peek);

    }
}