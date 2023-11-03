package generic;

//class Container {

import java.util.List;

//    // String contain;
//
//    Object contain;
//
////    public Container(String contain) {
////        this.contain = contain;
////    }
////
////    public String getContain() {
////        return contain;
////    }
//    public Container(Object contain) {
//        this.contain = contain;
//    }
//
//    public Object getContain() {
//        return contain;
//    }
//
//    public void showType() {
//        System.out.println(contain.getClass().getName());
//    }
//}
//
//public class GenericClass {
//
//    public static void main(String[] args) {
//        //Container c=new Container("cdac");
//        // Container c=new Container(23);   // not posible
////        Container c = new Container(23);
//
//        Container c=new Container("cdac");
//        String s=(String)
//        System.out.println(c.getContain());
//        c.showType();
//    }
//}




//class Container<T> {
//    
//
//    T contain;
//
//    public Container(T contain) {
//        this.contain = contain;
//    }
//
//    public T getContain() {
//        return contain;
//    }
//
//    public void showType() {
//        System.out.println(contain.getClass().getName());
//    }
//}
//
//public class GenericClass {
//
//    public static void main(String[] args) {
//        Container<String> c=new Container("cdac");
//        String s= c.getContain();
//        System.out.println(s);
//        //c.showType();
//    }
//}





class Container<T,V> {
    

    T contain;

    public Container(T contain) {
        this.contain = contain;
    }
    

    public T getContain() {
        return contain;
    }
    
     public List showType(List<? super V> data) {
        return data;
    }
     
     public List showData(List<? super V> data){
        return data;
    }

    public void showType() {
        System.out.println(contain.getClass().getName());
    }
}

public class GenericClass {

    public static void main(String[] args) {
        Container<String,Integer> c=new Container("cdac");
        String s= c.getContain();
        System.out.println(s);
        System.out.println(List.of(102,2,3,4));
        System.out.println(List.of(102.2,2.3,3.3,4.3));
        List<Number> lst=List.of(102.2,120.12,12.2);
        System.out.println(c.showData(lst));
//        System.out.println(c.showData(new Object(22.23)));
        c.showType();
    }
}
