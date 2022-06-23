public class Element_Search {
    public static void main(String[] args) {
        int arr [] ={10,20,30,40,50};
        int i =0;
        int y = serach(arr,i,60);
        if(y==-1){
            System.out.println("Element Not Found");
        }
        else
            System.out.println(y);
    }

    private static int serach(int[] arr,int i,int sear) {
        if(i==arr.length){
            return -1;
        }
        if(i>arr.length){
            return -1;
        }
        int res = serach(arr,i+1,sear);
        if(arr[i] ==sear){
            return i;
        }
        return res;
    }
}
