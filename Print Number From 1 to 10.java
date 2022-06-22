public class print_no {
    private static void show(int i) {
        if(i == 0){
            return;
        }
        show(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        System.out.println("The Consecutive number from 1 to 10 is");

        show(10);
    }
}
