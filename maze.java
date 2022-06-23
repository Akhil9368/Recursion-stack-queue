import java.util.ArrayList;

public class Maze_Problem {
    static ArrayList<String> Maze(int currentrow,int currentcol,int finalrow,int finalcol){
        if(currentrow == finalrow && currentcol == finalcol){
            ArrayList<String>arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        if(currentrow > finalrow || currentcol > finalcol){
            ArrayList<String> arr = new ArrayList<>();
            return arr;
        }
        ArrayList<String> finalres = new ArrayList<>();
        ArrayList<String> fi = Maze(currentrow,currentcol+1 ,finalrow,finalcol);
        for (String s : fi){
            finalres.add("H"+s);
        }
        ArrayList<String> si= Maze(currentrow+1,currentcol,finalrow, finalcol);
        for (String s : si){
            finalres.add("V"+s);
        }
        return finalres;
    }
    public static void main(String[] args) {
        System.out.println(Maze(0,0 ,2,2));
    }
}
