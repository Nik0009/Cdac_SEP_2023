
package generic;

import java.util.List;


public class Generic {

    // generic method
//    public static <E>void showData(E arr[]){
//        for(E s:arr){
//            System.out.println(s);
//        }
//    }
    
//   
    
    // while cards 
    // upper bound
//     public static <E>void showData(List<E> lst){
//        for(E s:lst){
//            System.out.println(s);
//        }
//    }
    
    // lower bound
    public static void showData(List<? super Integer> lst){
        for(Object s:lst){
            System.out.println(s);
        }
    }
    
    
//       public static <E>void showData(List<? extends Number> lst){
//        for(Number s:lst){
//            System.out.println(s);
//        }
//    }
    
    public static void main(String[] args) {
       // String names[]={"ssd","ssss"};
        //Integer ages[]={1,2,34};
        //showData(names);
        //showData(ages);
        
//        List lst1=List.of("ssd","ssss");
//        List lst2=List.of(1,2,34);
//        showData(lst1);
//        showData(lst2);

        
        List<Integer> lst2=List.of(1,2,34);
        List<Number> lst3=List.of(1.1,2.2,34.34);
        showData(lst2);
        showData(lst3);
        
    }
    
}
