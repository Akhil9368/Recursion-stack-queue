import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class N_Queen_tr {
    public static void main(String[] args) {
       String arr[][] = new String[5][5];
       int currentrow=0;
        List<List<String>> net = new ArrayList<>();
        List<String> list= new ArrayList<>();
        List<List<String>> ne =n_queen(arr,currentrow,net);
        System.out.println(ne);


    }
    private static List<List<String>> n_queen(String[][] arr, int currentrow,List<List<String>> net) {
        List<List<String>> res=new ArrayList<>();
        if(currentrow == arr.length)
        {

                List<String> resr=new ArrayList<>();
                for(String r[]: arr)
                {
                    String a="";
                    for(String e: r)
                    {
                        if(e=="Q") a+="Q";
                        else a+=".";
                    }
                    resr.add(a);
                }
                res.add(resr);
                return res;

        }
        for(int col =0;col<arr[currentrow].length;col++){
            if(canIplaceQueen(arr,currentrow,col)){
                arr[currentrow][col]= "Q";
                net = n_queen(arr,currentrow+1,net);
                arr[currentrow][col] ="-";
            }
        }
       return net;
    }
    private static boolean canIplaceQueen(String[][] arr, int currentrow, int col) {
        for(int i=currentrow;i>=0;i--){
            if(arr[i][col]=="Q"){
                return false;
            }
        }
        for(int i=currentrow,j=col;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=="Q"){
                return false;
            }
        }
        for (int i = currentrow,j=col; i>=0 && j< arr.length ; i--,j++) {
            if(arr[i][j]=="Q"){
                return false;
            }

        }
        return true;
    }

}
