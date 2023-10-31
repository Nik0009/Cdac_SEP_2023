package teststaticinnerclass;

//class ParentOfAnnonymous {
//    void greeting(){
//        System.out.println("Say hello...");
//    
//    }
//}

//@FunctionalInterface
interface ParentOfAnnonymous{
    void greeting(); // if interface having only one method so it is called as FunctionalInterface
    void show();
}


class OuterOfAnnonymous {
    ParentOfAnnonymous p=new ParentOfAnnonymous (){
        @Override
       public void greeting() {
            System.out.println("Say namaste...");
        }

        @Override
        public void show() {
             System.out.println("Say ram ram...");
        }
    
    };

}

public class TestAnnonymousIClass {
    
    public static void main(String[] args){
        OuterOfAnnonymous o=new OuterOfAnnonymous();
        o.p.greeting(); // accessing OuterOfAnnonymous class
        o.p.show();
    
    }
}
