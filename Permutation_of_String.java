import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(perm("abc"));
    }

   public static ArrayList<String> perm(String str) {
        if(str.length() == 0){
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        char ch = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> sb  = perm(subString);
        ArrayList<String> str1 =  new ArrayList<>();
        for(String v : sb){
            for (int i = 0; i <=v.length(); i++) {
                StringBuffer sb1 = new StringBuffer(v);
                sb1.insert(i,ch);
                str1.add(sb1.toString());
            }
        }
        return str1;
    }


}
