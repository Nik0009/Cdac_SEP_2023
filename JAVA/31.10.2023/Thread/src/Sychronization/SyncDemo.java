
package Sychronization;


public class SyncDemo implements Runnable {

    static int x;
    
    @Override
    public void run() {
        
        synchronized (this) {
             for(int i=0;i<1000;i++){
            x++;
            x--;
        }
        }
        // this bolck will give chaged o/p always 
//         for(int i=0;i<1000;i++){
//            x++;
//            x--;
//        }
       
    }
    public static void main(String[] args) {
        SyncDemo sd=new SyncDemo();
        
        Thread th[]=new Thread[100];
        for(int i=0;i<th.length;i++){
            th[i]=new Thread(sd);
            th[i].start();
        }
        System.out.println("final value of x is "+x);
    }
    
}
