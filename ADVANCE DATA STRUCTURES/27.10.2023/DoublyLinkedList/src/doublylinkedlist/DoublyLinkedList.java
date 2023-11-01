
package doublylinkedlist;

class Node{
    Node prev;
    int data;
    Node next;
}

public class DoublyLinkedList {
    
    Node head;
    
    void addFirst(int val){
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null){
            newNode.next=null;
            newNode.prev=null;
            head=newNode;
        }
        else{
            newNode.prev=null;
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        
    }
    
    void addLast(int val){
        
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null){
            newNode.next=null;
            newNode.prev=null;
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }   
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=null;
            
        }
        
    }
    
    void delete(int val){
        if(head==null){  
            return;
        }
        
        Node temp=head;
        while(temp!=null && temp.data!=val){
            temp=temp.next;
        }
        if(temp==null){    // for no node
            System.out.println("data not found");
        }
        else if(temp==head){  // for head
            head=head.next;
            head.prev=null;    
        }
        else if(temp.next==null){  // for last node
            temp.prev.next=null;
        }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
    
    boolean search(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val)
                return true;
            temp=temp.next;
        }
        
        return false;
    }
    
    void printDoublyLinkedList(){
        System.out.println("Forword movement");
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.println(temp.data);
            if(temp.next==null){
                last=temp;
            }
            temp=temp.next;
        }
        System.out.println("backword movement");
        while(last!=null){
            System.out.println(last.data);
            last=last.prev;
        }
    }
    
    
    public static void main(String[] args) {
       
        DoublyLinkedList dlld=new DoublyLinkedList();
        dlld.addFirst(100);
        dlld.addFirst(200);
        dlld.addFirst(300);
        
        dlld.addLast(400);
        dlld.addLast(500);
        dlld.addLast(600);
        
        dlld.delete(100);
        
        System.out.println(dlld.search(300));
        
        
        dlld.printDoublyLinkedList();
    }
    
}
