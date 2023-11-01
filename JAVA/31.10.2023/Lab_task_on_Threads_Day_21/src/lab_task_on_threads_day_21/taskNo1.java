
package lab_task_on_threads_day_21;

//1.Write a Java program that creates two threads to find and print even and odd numbers from 1
//to 20. ...


//public class taskNo1 extends Thread {
//   
//    @Override
//    public void run(){
//      
//        
//          for(int i=1;i<=20;i++){
//            if(i%2==0){
//                System.out.println(i+" is even number.");
//            }
//            else{
//                 System.out.println(i+" is odd number.");
//            }
//        
//        }
//       
//    }
//   
//    public static void main(String[] args) {
//        taskNo1 tn1=new taskNo1();
//        taskNo1 tn2=new taskNo1();
//        
//        
//        tn1.start();
//        
//        tn2.start();
//        
//    }
//    
//}



public class taskNo1 {
    public static void main(String[] args) {
        Runnable evenThread = () -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        };

        Runnable oddThread = () -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
            }
        };

        Thread thread1 = new Thread(evenThread);
        Thread thread2 = new Thread(oddThread);

        thread1.start();
        thread2.start();
    }
}
