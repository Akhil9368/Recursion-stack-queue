public class leftpy {

        public static void main(String[] args) {
            int n =5;
            int row =0;
            Right_pym(n,row);
        }
        private static void Right_pym(int n,int row) {
            if(n==row){ return;}
            printspace(n,row);
            printstar(row);
            System.out.println();
            Right_pym(n,row+1);

        }
     private static void printspace(int n ,int row) {
            if(row>n-(row-1)){
                return;
            }

               System.out.print(" ");
               printspace(n,row+1);

    }
    private static void printstar(int row) {
            if(row <0){
                return;
            }
            System.out.print("* ");
            printstar(row-1);
        }
    }


