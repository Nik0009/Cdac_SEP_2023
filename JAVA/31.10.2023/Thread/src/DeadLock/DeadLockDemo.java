
package DeadLock;


public class DeadLockDemo {
    public static void main(String[] args) {
        String rec1="aman";
        String rec2="suman";
        
        Thread t2=new Thread();
        
        
        public void run(){
        
            synchronized (rec2) {
                System.out.println("thread 2 uses rec1"+rec2);
                try{
                    sleep(100);
                }
                catch(Exception e){}
            }
            synchronized (rec1) {
                System.out.println("thread 2 uses resource 1 "+rec1);
        }
        }
      
        
        
    }
}
