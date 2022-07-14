
import java.util.LinkedList;
import java.util.Queue;

class stack_Queue{
     static Queue<Integer> que1= new LinkedList<>();
     static Queue<Integer> que2= new LinkedList<>();

   int top;
   void Push(int elem){
       if(que2.isEmpty()){
           que2.add(elem);
       }
       else {
           while(!que2.isEmpty()) {
               int val = (int) que2.remove();
               que1.add(val);
           }
           que2.add(elem);
           while(!que1.isEmpty()){
               int val= (int) que1.remove();
               que2.add(val);
           }
       }
   }
   void Pop(){
       if(que2.isEmpty()){
           System.out.println("No element present in the Queue....");
           return;
       }
       else
       {
          int val =  que2.remove();
           System.out.println(val);
       }
   }
   void Top(){
       if(que2.isEmpty()){
           System.out.println("No element present in the Queue....");
           return;
       }
       System.out.println(que2.peek());
   }

}
public class Stack_Implementation_Queue {
    public static void main(String[] args) {
       stack_Queue st =new stack_Queue();

        st.Push(3);
        st.Push(4);
        st.Push(2);
        st.Push(1);
        st.Top();
        st.Pop();
        st.Top();
    }
}
