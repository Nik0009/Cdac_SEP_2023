
package test_Queue;


public class QueueImplementation {
    final int SIZE = 3;
    int arr[] = new int[SIZE];
    int front = 0;
    int rear = 0;

    public void push(int value) {
        if (rear == SIZE) {
            System.out.println("Queue is Full");
            return;
        }
        arr[rear] = value;
        rear++;
    }

    public void pop() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
//        else
//        {
//            System.out.println("pop elemnt is ");
//            for(int i=0;i<rear-1;i++){
//                arr[i]=arr[i+1];
//            }
//            if(rear<SIZE){
//                
//            }
//        }
        
        
        System.out.println(arr[front] + " is popped");
        front++;
    }

    public static void main(String[] args) {
        QueueImplementation qi = new QueueImplementation();
        qi.push(10);
        System.out.println("10 is PUSHED SUCCESSFULLY");
        qi.push(20);
        System.out.println("20 is PUSHED SUCCESSFULLY");
        qi.push(30);
        System.out.println("30 is PUSHED SUCCESSFULLY");

        qi.pop();
        qi.pop();
        qi.pop();


    }
}
