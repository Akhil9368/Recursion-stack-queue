import java.util.ArrayList;

public class SubsetSumProblem {
   public static void main(String[] args) {
      int arr [] = {1,2,3};
      ArrayList<ArrayList<Integer>> result= new ArrayList<>();
      ArrayList<Integer> arr1 = new ArrayList<>();
      int index=0;int sum =10;
      int target =0;
      ArrayList<ArrayList<Integer>> temp = recursive(arr,index,arr1,target,result);
      System.out.println(temp);
   }

   private static ArrayList<ArrayList<Integer>> recursive(int[] arr,  int index, ArrayList<Integer> arr1, int target, ArrayList<ArrayList<Integer>> result) {
      if(index==arr.length ){

           result.add(new ArrayList<>(arr1));
           return result;
      }
      arr1.add(arr[index]);
      target = target+arr[index];
      recursive(arr,index+1,arr1,target, result);
      target-=arr1.remove(arr1.size()-1);
      recursive(arr,index+1,arr1,target, result);

      return result;
   }

}
