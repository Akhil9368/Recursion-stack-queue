public class Numberprint {
    public static void main(String[] args) {
        int n = 5;
        int row =5;
        printpatter(n,row);
    }
    private static void printpatter(int n,int row) {
        if (n <0) {
            return;
        }
        printpatter(n - 1,row-1);
        printno(n,row);
        System.out.println();

    }
    private static void printno(int n,int row) {
        if (n <=0) {
            return;
        }
        System.out.print(row);
        printno(n-1,row);
    }
}
