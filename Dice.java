import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dice {
    static ArrayList<String> dice(int currentval , int finalval){
        if(currentval == finalval){
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        if(currentval>finalval){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> arr1 =  new ArrayList<>();
        for (int dice =1; dice<=6;dice++){
            int newvalue = currentval+dice;
            ArrayList<String> list1 = dice(newvalue,finalval);
            for (String s : list1) {
                     arr1.add(s+dice);
            }

        }
        return arr1;
    }
    public static void main(String[] args) {
        ArrayList<String> res = dice(0,4);
        System.out.println(res);
    }
}
