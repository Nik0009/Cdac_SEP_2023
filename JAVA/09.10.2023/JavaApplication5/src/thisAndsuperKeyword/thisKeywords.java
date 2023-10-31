
package thisAndsuperKeyword;

class a{
int a;

    public a() {
        this(222);
        a=10;
    }
//    public a(int x) {
//        
//        a=x;
//        show();
//    }
    public a(int a) {
        
        this.a=a;
        show();
    }
    void show(){
    System.out.println(a);
    }

}
public class thisKeywords {
     public static void main(String[] args){
     a A=new a();
     A.show();
     //System.out.print(A.a);
     }
}
