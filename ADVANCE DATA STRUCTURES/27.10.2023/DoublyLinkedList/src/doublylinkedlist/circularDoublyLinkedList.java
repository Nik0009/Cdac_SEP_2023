package doublylinkedlist;

class Node {

    Node prev;
    int data;
    Node next;
}

public class circularDoublyLinkedList {

    Node head;

    void addFirst(int val) {
        Node newNode = new Node();
        newNode.data = val;

        if (head == null) {
            newNode.prev = newNode.next = newNode;
            head = newNode;
        }
        else {
            Node last = head.prev;
            newNode.data = val;
            newNode.next = head;
            newNode.prev = last;
            last.next = head.prev = newNode;
            head = newNode;
        }
    }

    void printDoublyLinkedList() {

        Node temp = head;

        while (temp.next != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
        System.out.println("backword movement");

        Node last = head.prev;
        temp = last;
        while (temp.prev != last) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        circularDoublyLinkedList cll = new circularDoublyLinkedList();
        cll.addFirst(100);
        cll.addFirst(200);
        cll.printDoublyLinkedList();
    }
}

//class Node{
//    Node prev;
//    int data;
//    Node next;
//}
//
//public class circularDoublyLinkedList {
//    
//    Node head;
//    
//    void addFirst(int val){
//        Node newNode=new Node();
//        newNode.data=val;
//        
//        
//        if(head==null){
//            newNode.prev=newNode.next;
//            newNode.next=newNode.prev;
//            head=newNode;
//        }
//        else{          
//            newNode.prev=head.next;
//            newNode.next = head;
//            head=newNode;
//            
//        }  
//    }  
//    
//    
//    
//    
//    
//    void printDoublyLinkedList(){
//        
//        Node temp=head;
//        Node last=null;
//        while(temp!=null){
//            System.out.println(temp.data);
//            if(temp.next==null){
//                last=temp;
//            }
//            temp=temp.next;
//        }
//         System.out.println("backword movement");
//        while(last!=null){
//            System.out.println(last.data);
//            last=last.next;
//        }
//    }
//    
//    
//    public static void main(String[] args) {
//        circularDoublyLinkedList cll=new circularDoublyLinkedList();
//        cll.addFirst(100);
//        cll.addFirst(200);
//        cll.addFirst(300);
//        cll.printDoublyLinkedList();
//    }
//}

