public class Patter123456 {
    public static void main(String[] args) {
        int n =4, row =1;
        print12(n,row,1);
    }

    private static void print12(int n, int row, int num) {
        if(n<row){
            return;
        }
        printno(row,num);
        num=num+row;
        System.out.println();
        print12(n,row+1,num);
    }

    private static void printno(int row, int num) {
        if(row<=0){
            return;
        }
        System.out.print(num+" ");
        printno(row-1,num+1);
    }
}
