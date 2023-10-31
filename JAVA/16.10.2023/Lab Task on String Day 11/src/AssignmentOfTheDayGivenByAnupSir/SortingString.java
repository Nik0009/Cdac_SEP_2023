package AssignmentOfTheDayGivenByAnupSir;

//import java.util.Arrays;
public class SortingString {

    public static void main(String[] args) {
        String s="name,email,last";
       // char a[]=s.toCharArray();
       String a[]=s.split(",");
       // Arrays.sort(a);
       String sort;
       for(int i=0;i<a.length-1;i++)
       {
          for(int j=i+1;j<a.length;j++){
              if(a[i].compareTo(a[j])>0){
                  sort=a[i];
                  a[i]=a[j];
                  a[j]=sort;
              }
              
          }
         
       }
        for(String names:a){
            System.out.println(names);
        }
    }


}


//        String name = "Ganesh,Bahvesh,bavesh,Ashok";
//        String n[]=name.split(",");
////        for(String names:n){
////            System.out.println(names);
////        }
//        
//        for(int i=0;i<n.length-1;i++){
//            for(int j=i+1;j<n.length;j++){
//            if(n[i].compareTo(n[j])>0){
//            String t;
//            t=n[i];
//            n[i]=n[j];
//            n[j]=t;
//            }
//        }
//        }
//        
//        for(String names:n){
//            System.out.println(names);
//        }
//    }
//
//}
