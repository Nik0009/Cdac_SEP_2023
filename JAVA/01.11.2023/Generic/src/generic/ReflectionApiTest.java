
package generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
//    public void showInfo(){
//        System.out.println("hello "+name+" you age is "+age);
//    
//    }
      private void showInfo(){
        System.out.println("hello "+name+" you age is "+age);
    
    }
}

public class ReflectionApiTest {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
//        Person p=new Person("reamesh",23);
//        p.name;

          // create class reference
          Class personClass=Person.class;
          
          // create constructor
          Constructor cons= personClass.getDeclaredConstructor(String.class,int.class);
          
          // create object
          Object object= cons.newInstance("ramesh",23);
          
          // for set the private fileds using reflectionApi
          Field fname=personClass.getDeclaredField("name");
          fname.setAccessible(true);
          fname.set(object, "suresh");
          
          // for set the private method using reflectionApi
          Method m=personClass.getDeclaredMethod("showInfo");
          m.setAccessible(true);
          m.invoke(object);
          
          String s=(String)fname.get(object);
          System.out.println(s);
          
          Field fage=personClass.getDeclaredField("age");
          fage.setAccessible(true);
          int ag=fage.getInt(object);
          System.out.println(ag);
          
    }
}
