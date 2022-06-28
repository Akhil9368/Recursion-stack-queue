public class binary_search {
    public static void main(String[] args) {
        int arr [] =  new int[]{10,20,30,40,50,60,70};
        int i=0;
        int j=arr.length-1;
        int search =170;
        int index = binary(arr,i,j,search);
        System.out.println(index);
    }

    private static int binary(int[] arr, int i, int j,int search) {
        if(i>j){
            return -1;
        }
        int mid = i+(j-i)/2;
        if(arr[mid] == search){
            return mid;
        }
         if(search< arr[mid]) {
          return binary(arr, i, mid - 1, search);
        }
        else {
            return binary(arr, mid + 1, j, search);
        }
    }
}
