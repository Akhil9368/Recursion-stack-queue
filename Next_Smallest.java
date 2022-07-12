import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class next_Smallest {
    public static ArrayList<Integer> nes(int [] arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        arr1.add(-1);

        for(int a = arr.length-2; a>=0; a--){
            while(!st.empty() && arr[a]< st.peek()){
                st.pop();
            }
            int val = st.empty() ? -1 : st.peek();
            arr1.add(val);
            st.push(arr[a]);
        }
        Collections.reverse(arr1);

        return arr1;
    }
    public static void main(String[] args) {
        int arr [] = {10,20,5,11,4};
        ArrayList<Integer> ar = nes(arr);
        System.out.println(ar);
    }
}
