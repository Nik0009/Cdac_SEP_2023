
package constructorInjection;

import java.util.Set;


public class Customer {
    private int cusId;
    private String cusName;
    private Set<String> itemPurchased;

    public Customer() {
    }

    public Customer(int cusId,  String cusName, Set<String> itemPurchased) {
        System.out.println("const running");
        this.cusId = cusId;
        this.cusName = cusName;
        this.itemPurchased = itemPurchased;
    }

    @Override
    public String toString() {
        return "Customer{" + "cusId=" + cusId + ", cusName=" + cusName + ", itemPurchased=" + itemPurchased + '}';
    }
}
