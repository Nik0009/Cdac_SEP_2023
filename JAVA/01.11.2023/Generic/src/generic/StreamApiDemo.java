
package generic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
//        List<String> lst=List.of("ramesh","suresh","dinesh","bahvesh");
//        
//        for(String s:lst){
//            System.out.println(s);
//        }
//        System.out.println("******************************");
//        
//       // lst.stream().forEach(e->System.out.println(e));
//       
//       // method referance
//        lst.stream().forEach(System.out::println);
//        

        List<Integer> lst =List.of(12,12,11,23,15,35);
        System.out.println(lst);
       // lst.stream().forEach(e->System.out.println(e));
     //  List<Integer> evenlst=lst.stream().filter(i->i%2==0).collect(Collectors.toList());
       //lst.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println());
       
     //   System.out.println(evenlst);

//Set<Integer> st=lst.stream().map(i->i+5).collect(Collectors.toSet());
//System.out.println(st);


//lst.stream().sorted().forEach(System.out::println);

//lst.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);


//Integer i=lst.stream().min((x,y)->x.compareTo(y)).get();
//        System.out.println(i);


String arr[]={"ramesh","suresh","dinesh","bahvesh"};
Arrays.stream(arr).filter(e->e.startsWith("r")).forEach(System.out::println);



    }
}
