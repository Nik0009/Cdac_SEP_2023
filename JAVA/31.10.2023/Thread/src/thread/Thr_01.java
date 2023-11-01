
package thread;



public class Thr_01 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
//            if(this.getName().equals("Second"))
//            {
//                try{
//                sleep(1000);
//                }catch(Exception e){}
//            }
            System.out.println(this.getName()+i);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thr_01 t1=new Thr_01();
        Thr_01 t2=new Thr_01();//newlyBorn stage
        
        t1.setName("First");
        t2.setName("Second");
       
        t1.start();
        t2.start();//ReadyToRun
        
//        t2.setPriority(10);
//        System.out.println(t2.getPriority());
//        System.out.println(t1.getPriority());
//        try{
//        t1.join();
//        t2.join();
//        }catch(Exception e){}
//        System.out.println("Main Thread Exited");
    }
}