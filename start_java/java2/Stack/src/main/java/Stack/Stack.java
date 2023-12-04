package Stack;

public class Stack {

    private int top;
    private int maxSize;
    private Object stackArray[];

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new Object[maxSize];
        top = -1;
    }

    // stack 공간이 비어 있는지?
    public boolean isEmpty() {
        return (top == -1);
    }
    // stack 공간이 다 차있니?
    public boolean isFull(){
        return (top == maxSize - 1);
    }

    //추가
    public void push(Object item){
        if (isFull()){
            System.out.println("남은 stack 공간이 없습니다.");
            return;
        }
        //추가 가능
        top++;
        stackArray[top] = item;
    }

    //삭제
    public Object pop(){
        Object item = peek();
        top--;

        return item;
    }

    // 집어내다
    public Object peek(){ //getter
        if (isEmpty()) {
            System.out.println("stack 공간에 아무것도 없습니다");
            return null;
        }
        return stackArray[top];
    }
}