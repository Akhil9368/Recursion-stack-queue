import java.util.Stack;

class Stack_Doubly{
    class Node{
        int data;
        Node next;
        Node prev;
    }
    Node Head;
    Node tail;
    int  top=0;

    void push(int elem){

        Node node = new Node();
        node.data=elem;
        node.prev=null;
        node.next=null;
        if(top == 0){
            Head=tail=node;
        }
        else {
            Head.prev = null;
            node.next = Head;
            Head=node;
        }
     top++;

    }
    void pop(){
        if(top==0){
           throw new RuntimeException("Stack is Empty");
        }
        else
        {
            int temp = Head.data;
            Head = Head.next;
            top--;
        }
    }
    void peek(){
        if(top ==0){
           throw new RuntimeException("No Data Present in the stack");
        }
        System.out.println(Head.data);
    }
}

public class stackDoubly {
    public static void main(String[] args) {
    Stack_Doubly st = new Stack_Doubly();
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(60);
    st.pop();
    st.pop();
    st.pop();
    st.peek();
    }
}
