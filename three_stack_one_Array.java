class three_stack{
    int capacity;
    int arr[];
    int firsTop;
    int secondTop;
    int thirdTop;
    int k ;
    three_stack(int capacity){
        this.capacity = capacity;
        arr =new int[capacity];
        k=capacity/3;
        firsTop=-1;
        thirdTop=capacity;
        secondTop=k-1;

        }
 void firstTop(int elem){
     if(firsTop<=secondTop){
        firsTop++;
         arr[firsTop]=elem;
     }
     else
         throw new RuntimeException("first Stack is full");

 }
 void SecondTop(int elem){
     if(firsTop<= secondTop && secondTop<2*k-1){
         secondTop++;
         arr[secondTop]=elem;
     }
     else
         throw new RuntimeException("second Stack is full");
 }
 void ThirdTop(int elem){
     if(thirdTop >= 2*k+1){
         thirdTop--;
         arr[thirdTop]=elem;
     }
     else
         throw new RuntimeException("third Stack is full");
 }


 void firstpeek(){
     if(firsTop==-1){
         throw  new RuntimeException("Stack IS Empty !!!");

     }
     else
         System.out.println(arr[firsTop]);
 }
    void Secondpeek(){
        if(secondTop == k-1){
            System.out.println("No Element was Found 2!!!");
            return;
        }
        else
            System.out.println(arr[secondTop]);
    }
    void Thirdpeek()
    {
       if(thirdTop== capacity){
           System.out.println("Third Stack Is Empty !!!");
           return;
       }
       else
           System.out.println(arr[thirdTop]);
    }
    void firstPop(){
        if(firsTop ==-1){
            throw new RuntimeException("Stack 1 is empty cannot be deleted");
        }
        else{
            int temp =arr[firsTop];
            firsTop--;
        }
    }
    void secondPop(){
        if(secondTop == k-1){
            throw new RuntimeException("Stack 2 is empty Cannot be deleted");
        }
        else
        {
            int temp =arr[secondTop];
            secondTop--;
        }

    }
    void ThirdPop(){
      if(thirdTop == capacity){
          throw new RuntimeException("Stack 3 is Empty Cannot be deleted");
      }
      else {
          int temp = arr[thirdTop];
          thirdTop++;
      }
    }

}
public class three_STack_one_Array {
    public static void main(String[] args) {
        three_stack st = new three_stack(12);
        st.firstTop(10);
        st.firstTop(20);
        st.firstTop(30);
        st.firstTop(40);

        st.firstpeek();
        st.firstPop();
        st.firstpeek();

        st.SecondTop(80);
        st.SecondTop(70);
        st.SecondTop(60);
        st.SecondTop(50);

        st.Secondpeek();
        st.secondPop();
        st.Secondpeek();

        st.ThirdTop(120);
        st.ThirdTop(110);
        st.ThirdTop(100);
        st.ThirdTop(90);

        st.Thirdpeek();
        st.ThirdPop();
        st.Thirdpeek();}
}
