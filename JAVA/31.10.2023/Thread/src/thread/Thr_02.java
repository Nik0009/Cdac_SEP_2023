
package thread;

//public class Thr_02 implements Runnable{
//    String name;
//
//    public Thr_02(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void run() {
//        for(int i=0;i<9;i++){
//            System.out.println(this.name);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Thr_02 t1=new Thr_02("one");
//        Thr_02 t2=new Thr_02("two");
//        
//        Thread th1=new Thread(t1);
//        Thread th1=new Thread(t2);
//        
//        th1.start();
//        th2.start();
//    }
//    
//}


public class Thr_02 implements Runnable{
    String name;

    public Thr_02(String name) {
        this.name=name;
    }
    
     @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(this.name+i);
        }
    }
    public static void main(String[] args) {
        Thr_02 t1=new Thr_02("One");
        Thr_02 t2=new Thr_02("Two");
        
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        
        th1.start();
        th2.start();
    }   
}
