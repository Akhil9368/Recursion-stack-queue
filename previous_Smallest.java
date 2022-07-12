import java.util.ArrayList;
import java.util.Stack;

public class Previous_Smallest {
    public static void main(String[] args) {
        int arr[]= {2,5,3,7,8,1,9};
        ArrayList<Integer> arr1 =prevsmall(arr);
        System.out.println(arr1);
    }

    private static ArrayList<Integer> prevsmall(int[] arr) {
        Stack<Integer> rr = new Stack<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(-1);
        rr.push(arr[0]);
        for(int i =1;i< arr.length;i++){
            while(!rr.empty() && arr[i]<=rr.peek()){
                rr.pop();
            }
            int prevSmall = rr.empty() ? -1 : rr.peek();
            arr2.add(prevSmall);
            rr.push(arr[i]);
        }
        return arr2;
    }
}
