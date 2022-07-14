import java.util.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Queue {
    static Queue <Integer> que;
    public static void main(String[] args) {
         que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que = reverseQueue(que);
        print();


    }

    private static Queue reverseQueue(Queue que) {
        if(que.isEmpty()){
            return que;
        }
        int data = (int) que.peek();
        que.remove();
        que = reverseQueue(que);
        que.add(data);

        return que;

    }
    private static  void  print(){
    while(!que.isEmpty()){
        System.out.print(que.peek() + " ");
        que.remove();
     }
    }
}
