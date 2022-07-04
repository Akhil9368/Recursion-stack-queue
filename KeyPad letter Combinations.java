import java.util.ArrayList;
import java.util.List;

public class Leetcode_sol {
    // KeyPad letter Combinations
    // iny nu[]= {0,1,2,3,4,5,6,7,8,9}
    static String str1 [] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String str = "34";
        List<String> sub =substr(str);
        System.out.println(sub);

    }

    private static List<String> substr(String str) {

        if(str.length() == 0){
            ArrayList<String> st= new ArrayList<>();
            st.add("");
            return st;
        }
        char semsub= str.charAt(0);
        String sub = str.substring(1);
        int digit = semsub-'0';
        String val = str1[digit];
        List<String> ch = new ArrayList<>();
        for (int i = 0; i < val.length(); i++) {
            List<String> ch1  =substr(sub);
            for (String s : ch1) {
                ch.add(val.charAt(i)+s);
            }

        }
        return ch;
    }
}
