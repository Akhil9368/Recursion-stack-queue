public class downp {
    public static void main(String[] args) {
        int  n=5,row=5;
        pdown(n,row);
    }

    private static void pdown(int n, int row) {
        if(n<=0){
            return;
        }
        prints(row);
        System.out.println();
        pdown(n-1,row-1);
    }

    private static void prints(int row) {
        if(row==0){
            return;
        }
        System.out.print("*");
        prints(row-1);
    }
}
