package constructorInjection;

public class Addition {

    private int a;
    private int b;

    public Addition() {
    }

    public Addition(int a, int b) {
        System.out.println("i-i");
        this.a = a;
        this.b = b;
    }
     public Addition(double a,double  b) {
         System.out.println("d-d");
        this.a = (int)a;
        this.b = (int)b;
    }
      public Addition(String a,String  b) {
         System.out.println("s-s");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        
    }


    @Override
    public String toString() {
        return "Addition{" + "a=" + a + ", b=" + b + '}';
    }

}
