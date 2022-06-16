import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println("Enter How Many Number You Want to print in fibonacci Series :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
        for (int i=0;i<n;i++){
            System.out.print(fibo(i) + " ");
        }

    }
    private static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n==1|| n==2){
            return 1;
        }
        return fibo(n-2) + fibo(n-1);

    }
}
