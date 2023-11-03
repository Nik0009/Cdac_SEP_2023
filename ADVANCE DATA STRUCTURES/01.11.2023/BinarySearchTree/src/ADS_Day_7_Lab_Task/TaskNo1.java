
package ADS_Day_7_Lab_Task;

//1.Insertion: Implement a method to insert a node with a given key into the BST.
//2.Deletion: Implement a method to delete a node with a given key from the BST. Handle cases
//where the node has 0, 1, or 2 children appropriately.
//3.Search: Implement a method to search for a node with a given key in the BST. Return true if
//the key is found, and false otherwise.
//4.Inorder Traversal: Implement a method to perform an inorder traversal of the BST, which
//should display the nodes in sorted order.


class Node{
    Node left;
    int data;
    Node right;
    
    public Node(int data){
        this.left=null;
        this.data=data;
        this.right=null;
    }

}


public class TaskNo1 {
    Node root;
    
    public Node insertNode(Node root, int val) {
        if (root == null) {
            return new Node(val);
        } else if (root.data < val) {
            root.right = insertNode(root.right, val);
        } else {
            root.left = insertNode(root.left, val);
        }
        return root;
    }
    
     public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    
     public Node delete(Node root, int val) {
        if (root == null) {
            return null;
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int rightMin = getRightMin(root.right);
                root.data = rightMin;
                root.right = delete(root.right, rightMin);
            }
        }
        return root;
    }
     
     public boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (root.data < val) {
            return search(root.right, val);
        } else {
            return search(root.left, val);
        }

    }
    
      private int getRightMin(Node right) {

        Node temp = right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;

    }
    public static void main(String[] args) {
        TaskNo1 t=new TaskNo1();
        t.insertNode(t.root, 1);
        t.insertNode(t.root, 5);
        t.insertNode(t.root, 3);
        t.insertNode(t.root, 3);
        t.insertNode(t.root, 8);
        t.insertNode(t.root, 9);
        
        System.out.println("before deleteing");
        t.inorder(t.root);
        

        t.root=t.delete(t.root, 2);
        
        System.out.println("after deleteing");
        t.inorder(t.root);
        
        System.out.println(t.search(t.root, 1));
        
    }
}
