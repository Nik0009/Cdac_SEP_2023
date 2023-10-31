
package exceptionhandling;


public class InvalidEntryException  extends RuntimeException{
    
    public InvalidEntryException(String msg){
        super(msg);
    }
}
