import java.util.Scanner;

public class ABBCCCDDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height of traingle :");
        int n = sc.nextInt(), col = n-1;
        printno(n, col);
    }

    private static void printno(int n, int col) {
        if (n <= 0) {
            return;
        }
        printno(n - 1, col -1);
        printf(n, col);
        System.out.println();
    }

    private static void printf(int n, int col) {
        if (n <= 0) {
            return;
        }
        System.out.print((char) (65 + col)+" ");
        printf(n - 1, col);
    }
}
