class two_stack{
    int capacity;
    int rightTop;
    int arr [] ;
    int leftTop;
    int capacity1;
    two_stack(int capacity1){
        arr =new int[capacity1];
        leftTop =-1;
        rightTop=capacity1;
    }

    void firstAdd(int elem){
        if(leftTop<rightTop-1){
            leftTop++;
            arr[leftTop]=elem;
        }
        else
            throw new RuntimeException("Stack is full");
    }

    void LastAdd(int elem){
        if(leftTop<rightTop-1){
            rightTop--;
            arr[rightTop]=elem;
        }
        else
            throw new RuntimeException("Stack is full");
    }
 void leftPop(){
        if(leftTop==-1){
            throw new RuntimeException("Can Not be Deleted Because left stack is empty");
        }
        else
        {
            int temp= arr[leftTop];
            leftTop--;
        }
 }
 void rightPop(){
     if(leftTop==capacity1){
         throw new RuntimeException("Can Not be Deleted Because left stack is empty");
     }
     else
     {
         int temp= arr[rightTop];
         rightTop++;
     }

 }
    void leftpeek(){
        if(rightTop != -1) {
            if (leftTop < rightTop) {
                System.out.println(arr[leftTop]);
                return;
            }
        }
        else
        {
            System.out.println("No Element was Found...");
        }

    }
    void rightpeek(){
        if(rightTop != capacity) {
            if (leftTop < rightTop) {
                System.out.println(arr[rightTop]);
                return;
            }
        }
        else
        {
            System.out.println("No Element was Found...");
        }

    }
}

public class twoStack_one_Array {

    public static void main(String[] args) {
        two_stack st = new two_stack(10);
        st.firstAdd(10);
        st.firstAdd(20);
        st.firstAdd(30);

        st.LastAdd(70);
        st.LastAdd(60);
        st.LastAdd(50);
// Printing the topof the stack element
        st.leftpeek();
        st.rightpeek();
// Pop the stack elements
        st.leftPop();
        st.rightPop();
//After pop print the top elements
        st.leftpeek();
        st.rightpeek();
    }
}
