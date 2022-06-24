import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Occurence {
    public static void main(String[] args) {
        int arr [] = {1,2,3,3,3,3,4,5,6,3,4,3};
        int i=0;
        int sear =2;
        System.out.println("The Occuernce of " + sear +" is");
        ArrayList<Integer> list= occuer(arr,i,sear);
        System.out.println(list);
    }

    private static ArrayList<Integer> occuer(int[] arr, int i,int sear) {
        if(i==arr.length){
            ArrayList<Integer> list =new ArrayList<>();
            return list;
        }
        ArrayList<Integer>val= new ArrayList<>();
        val =occuer(arr,i+1,sear);
        if(arr[i] == sear){
            val.add(i);
        }
        return val;
    }
}
