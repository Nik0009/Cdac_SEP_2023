
package SirCode.generic;


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
    
    private void showInfo(){
        System.out.println("Hello "+name+", your age is "+age);
    }
}
public class TestReflectionApi {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        //create class reference
        Class personCls=Person.class;
        
        Constructor cons=personCls.getDeclaredConstructor(String.class,int.class);
        Object object=cons.newInstance("Ramesh",23);
        
        Field fname=personCls.getDeclaredField("name");
        fname.setAccessible(true);
        fname.set(object, "Suresh");
        
        Method m=personCls.getDeclaredMethod("showInfo");
        m.setAccessible(true);
        m.invoke(object);
        
        String s=(String)fname.get(object);
        System.out.println(s);
        
        Field fage=personCls.getDeclaredField("age");
        fage.setAccessible(true);
        int ag=fage.getInt(object);
        System.out.println(ag);
    }
}