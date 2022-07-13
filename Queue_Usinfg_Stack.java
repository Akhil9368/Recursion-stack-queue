import java.util.Stack;

class Queue_Stack{

    Stack st = new Stack();
    Stack k = new Stack();

    void Enquee(int elem){

       if(st.isEmpty()){
           st.push(elem);

         }
      else
         {
            while(!st.empty())
            {
                int val = (int) st.pop();
                k.push(val);
             }
            st.push(elem);
         while(!k.empty()) {
            int z = (int) k.pop();
            st.push(z);
          }
        }

}
void Deque(){
        if(st.empty()){
            System.out.println("Queue Is Empty...");
            return;
        }
        else
            st.pop();
    }
    void peek(){
        while(!st.empty()){
            System.out.println(st.pop());
        }
    }
}



public class Queue_Implementation {
    public static void main(String[] args) {
    Queue_Stack st = new Queue_Stack();
        st.Enquee(10);
        st.Enquee(20);
        st.Enquee(30);
        st.Enquee(40);
        st.Enquee(50);
        st.Deque();
        st.Deque();
        st.peek();
        st.Enquee(70);
        st.peek();
    }
}
