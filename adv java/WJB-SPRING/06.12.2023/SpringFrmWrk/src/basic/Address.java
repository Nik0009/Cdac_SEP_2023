
package basic;


public class Address {
    private int houseNo;
    private String street;
    private String city;
    private String pin;

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "address{" + "houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", pin=" + pin + '}';
    }
    
    
    
}
