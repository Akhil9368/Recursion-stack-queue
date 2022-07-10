import java.util.ArrayList;

class Stack1 <T>{
    ArrayList<T> arr;
    T val;
    int top;
    int capacity;
      Stack1(int capacity){
      this.capacity=capacity;
      arr=new ArrayList<>(capacity);
      top =-1;
    }
    void push(T val){
          if(top == capacity-1){
              System.out.println("Stack is over flow can't be added in the stack");
              return;
          }
          else
          {
              top++;
              arr.add(val);
          }
    }
    void peek(){
          if(top == -1){
              System.out.println("No Element present in the stack");
              return;
          }
          else
              System.out.println(arr.get(top));
    }
    void pop(){
          if(top == -1){
              System.out.println("Can not be deleted no element is found ");
              return;
          }
          else {
              T temp = arr.get(top);
              top--;
          }
    }

}
public class Generic_Stack {
    public static void main(String[] args) {
      Stack1 stack = new Stack1(5);
      stack.push("Akhil");
        stack.push("Akhil");
        stack.push("Akhil");
        stack.push(10);
        stack.push("Akhil1");
       // stack.push("Akhil1");
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
