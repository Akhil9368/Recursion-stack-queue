import java.util.Scanner;
import java.util.Stack;

class binary<T>{
     T data;
     binary <T> left;
     binary <T> right;
     binary (T data ){
        this.data= data;
        // By Default left and right are null;
    }
}
class opereations {
    String msg = "root";
    Scanner sc = new Scanner(System.in);
    int parent = -1;

    binary<Integer> insert() {
        System.out.println("Enter the data for " + msg + " Node and parent is " + parent);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        // Create a parent Node...../ Root Node....
        binary<Integer> btree = new binary<>(data);
        parent = data;
        msg = "left";
        btree.left = insert();
        parent = data;
        msg = "right";
        btree.right = insert();
        parent = data;
        msg = "root";
        return btree;
    }

    void print(binary<Integer> currentNode) {
        String output = "";
        if (currentNode == null) {
            return;
        }
        output += currentNode.data + " =>";
        if (currentNode.left != null) {
            output += " Left : " + currentNode.left.data;
        }
        if (currentNode.right != null) {
            output += " Right : " + currentNode.right.data;
        }
        System.out.println(output);
        print(currentNode.left);
        print(currentNode.right);
    }

    void preorder(binary<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void Inorder(binary<Integer> root) {
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    void Postorder(binary<Integer> root) {
        if (root == null) {
            return;
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    void PreOrderIterative(binary<Integer> root) {
        if (root == null) {
            return;
        }
        Stack<binary> st = new Stack<>();
        st.push(root);
        while (!st.empty()) {
            binary<Integer> node = st.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
    }

    void InOrder1(binary<Integer> root) {
        Stack<binary> st = new Stack<>();
        binary<Integer> temp = null;

        temp = root;
        while (temp != null || !st.isEmpty()) {
            while (temp != null) {
                st.push(temp);
                temp = temp.left;
            }
            temp = st.pop();
            System.out.print(temp.data + " ");
            temp = temp.right;
        }

    }

    void PostOrderIterative(binary<Integer> root) {
       Stack<binary> s1 = new Stack<>();
       Stack<Integer> s2 = new Stack<>();
       s1.push(root);
       while(!s1.empty()){
       root = s1.pop();
       s2.push(root.data);
       if(root.left != null) {s1.push(root.left);}
       if(root.right != null ){s1.push(root.right);}
       }
       while(!s2.empty()){
           System.out.print(s2.pop() + " ");
       }

    }

}
public class Binary_Tree {
    public static void main(String[] args) {

  opereations op = new opereations();
  binary<Integer> root = op.insert();
  op.print(root);
        System.out.println("PreOrder Traversal....");
        op.preorder(root);
        System.out.println();
        System.out.println("InOrder Traversal.....");
        op.Inorder(root);
        System.out.println();
        System.out.println("PostOrder Traversal....");
        op.Postorder(root);
        System.out.println();
        System.out.println("PreOrder Traversal....");
        op.PreOrderIterative(root);
        System.out.println();
        System.out.println("InOrder Traversal...");
        op.InOrder1(root);
        System.out.println();
        System.out.println("PostOrder Traversal....");
        op.PostOrderIterative(root);

    }
}
