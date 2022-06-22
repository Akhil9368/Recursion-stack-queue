import java.util.ArrayList;

public class Substring {
  static ArrayList<String>getSbString(String str){
  if(str.length() == 0){
      ArrayList<String> arr = new ArrayList<>();
      arr.add(" ");
      return arr;
  }
  char firstchar = str.charAt(0);

  String finalStr = str.substring(1);
  ArrayList<String > res= getSbString(finalStr);
          ArrayList<String> ffinal = new ArrayList<>();
        for (String v : res) {
            ffinal.add(v);
            ffinal.add(firstchar+v);

        }
  return ffinal;

    }
    public static void main(String[] args) {
        ArrayList<String> result = getSbString("amit");
        System.out.println(result);
    }
}
