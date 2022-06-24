public class AABABC {
    public static void main(String[] args) {
        int n = 5;
        int k = 0;
        print12(n, k);
    }

    private static void print12(int n, int k) {
        if (n <= 0) {
            return;
        }
        print12(n - 1, k);
        printAlpha(n, k);
        System.out.println();
    }

    private static void printAlpha(int n, int k) {
        if (n <= 0) {
            return;
        }
        System.out.print((char)(65 + k)+" ");
        printAlpha(n - 1, k + 1);
    }
}
