class opereations{
    int top;
    int arr[];
    int capacity;
    opereations(int capacity){
        this.capacity =capacity;
        arr =new int[capacity];
        top=-1;
    }

    void push(int elem){
        if(top == capacity-1){
            System.out.println("Over Flow");
            return;
        }
        else {
            top++;
            arr[top]=elem;
        }
    }
    int  pop(){
        if(top == -1) {
            System.out.println("UnderFlow1");
            return -1;
        }
            int elem = arr[top];
            top--;
        System.out.println("deleted");
            return elem;
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack is Empty !....");
            return -1;
        }
        else{
            System.out.println(arr[top]);
            return arr[top];}
    }

}
public class stack_opereations {
    public static void main(String[] args) {
    opereations op = new opereations(5);
         op.pop();
         op.peek();

        op.push(30);
        op.push(40);
        op.push(50);
        op.push(60);
        op.push(70);
       // op.push(80);

        op.pop();
        op.peek();
    }
}
