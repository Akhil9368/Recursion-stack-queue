class Queue{
    int data[];
    int rear;
    int front;
    int size;
    Queue(int capacity){
        data =new int [capacity];
        front= rear=-1;
        size=0;
    }
    void Enqueue(int elem){
        if(size == data.length){
            System.out.println("Queue is Full....");
            return;
        }
        else {
           if(front == -1 && rear == -1 ){
               front=0;
               rear =0;
               data[rear] = elem;
               size++;
           }
           else
           {
               rear++;
               data[rear]=elem;
               size++;
           }
        }
    }
    void Dequeue(){
        if(front == rear){
            System.out.println("No Elements Present in the Stack...");
            return;
        }
        else
        {
            front++;
            size--;
        }
    }
    void Display(){
        if(rear == -1 && front==-1){
            System.out.println("No element present in the stack...");
        }
        else
        {
            for (int i = front; i <=rear; i++) {
                System.out.print(data[i]+" ");
            }
        }
    }
    int setSize(){
        return size;
    }
}

public class Queue_array {
    public static void main(String[] args) {
        Queue q  = new Queue(5);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Dequeue();
        q.Display();
        System.out.println();
        System.out.println(q.setSize());




    }
}
