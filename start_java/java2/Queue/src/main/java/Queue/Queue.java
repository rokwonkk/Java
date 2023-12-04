package Queue;

public class Queue {

    private int front;
    private int rear;
    private int maxSize;

    private Object queueArray[];

    public Queue(int maxSize) {
        this.maxSize = maxSize;

        front = 0;
        rear = -1;

        queueArray = new Object[maxSize];
    }

    public boolean isEmpty(){
        return (front == rear + 1);
    }

    public boolean isFull(){
        return (rear == maxSize - 1);
    }

    public void push(Object item){
        if (isFull()) {
            System.out.println("남은 공간이 없습니다.");
            return;
        }
        rear++;
        queueArray[rear] = item;
    }

    public Object pop(){
        Object item = peek();
        front++;

        return item;
    }

    public Object peek(){
        if (isEmpty()) {
            System.out.println("공간이 비어있습니다.");
            return null;
        }
        return queueArray[front];
    }
}
