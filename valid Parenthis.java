import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;

public class Balance_Paranthesis {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> sw = new HashMap<>();
        sw.put('{', '}');
        sw.put('[', ']');
        sw.put('(', ')');
        if (str.length() % 2 != 0) {
            return false;
        } else {
            for (char str1 : str.toCharArray()) {
                if (str1 == '{' || str1 == '[' || str1 == '(') {
                    stack.push(str1);
                } else {
                    Character toOpening = stack.pop();
                    Character s1 = sw.get(toOpening);
                    if (s1 != str1) {
                        return false;
                    }
                }

            }
            return true;
        }
    }
    public static void main(String[] args) {

        String str = "{{[({)]}}";
        boolean str2 = isValid(str);
        if (str2){
            System.out.println("Valid String");
        }
        else
        {
            System.out.println("Not a Valid String");
        }
    }
}
