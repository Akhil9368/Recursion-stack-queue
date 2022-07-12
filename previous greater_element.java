import java.util.ArrayList;
import java.util.Stack;

public class Previous_Greater_Element {
    public static ArrayList<Integer> prec(int [] arr){
        Stack<Integer> st = new Stack<>();
        ArrayList arr1= new ArrayList();
        st.push(arr[0]);
        arr1.add(-1);
        for(int i =1;i< arr.length;i++){
            while( !st.empty() && st.peek() <= arr[i]){
                st.pop();
            }
            int nextGreaterValue = st.empty() ? -1: st.peek();
            arr1.add(nextGreaterValue);
            st.push(arr[i]);
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]= {10,4,2,20,40,12,30};
        ArrayList<Integer> finalone= prec(arr);
        System.out.println(finalone);

    }
}
