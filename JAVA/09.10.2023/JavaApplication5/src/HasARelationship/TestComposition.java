
package HasARelationship;
// check concept once agian 
class car{
//    private String name[];
     private String name;
     private engine engines[];

    public car(String name, engine[] engines) {
        this.name = name;
        this.engines = engines;
    }
    

//    public car(String[] name, engine[] engines) {
//        this.name = name;
//        this.engines = engines;
//    }

    

    void carDetails(){
        System.out.println("Car Details:");
//        for(String c:name){
//            System.out.println(c);
//        }
        System.out.println("name:"+name);
        for(engine e:engines){
             System.out.println(e);
        }
    
    }

    @Override
    public String toString() {
        return "car{" + "name=" + name  + '}';
    }
   
    
    
}
class engine{
    private String carModel;

    public engine(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "engine{" + "carModel=" + carModel + '}';
    }
    
    
}

public class TestComposition {
    public static void main(String[] args){
       engine e[]={new engine("maruti suzuki")};
     //  String c[]={"maruti suzuki","hundia"};
       // car c1=new car(c,e);
        car c1=new car("maruti suzuki",e);
        c1.carDetails();
    }
}
