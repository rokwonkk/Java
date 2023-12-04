package Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        String str = "First";
        stack.push(str);

        String peek = (String) stack.peek();
        System.out.println(peek);

        str = "Second";
        stack.push(str);

        peek = (String) stack.peek();
        System.out.println(peek);

        str = "Third";
        stack.push(str);

        str = "Four";
        stack.push(str);

        str = "Five";
        stack.push(str);

        peek = (String) stack.peek();
        System.out.println(peek);

        str = "six";
        stack.push(str);

        stack.pop();

        peek = (String) stack.peek();
        System.out.println(peek);

    }
}