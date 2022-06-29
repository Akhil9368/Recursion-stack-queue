public class Jospheus {
    public static void main(String[] args) {
        int n=5;
        int k=2;
        int start =1;
        int temp = jospheus(n,k);
        System.out.println(temp);


    }
    private static int jospheus(int n, int k) {
        if(n ==1){
            return 0;
        }
        int ans = jospheus(n-1,k);
        return (ans+k)%n;
    }
}
