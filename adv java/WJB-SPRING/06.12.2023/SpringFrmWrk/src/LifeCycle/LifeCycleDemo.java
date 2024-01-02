package LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class LifeCycleDemo {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("setter");
        this.x = x;
    }
    
    //user define life cycle method of spring
    @PostConstruct
    public void start(){
        System.out.println("INIT() method invoked");
    }
    
    @PreDestroy
    public void stop(){
        System.out.println("DESTORY() method invoked");
    }
    
    
}
