package HasARelationship;

class Person {

    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void personDetails() {
        System.out.println("Person Name :" + name);
        System.out.println("Person Address :" + address);
    }
}

class Address {

    private int houseNo;
    private String landMark;
    private String city;
    private String state;
    private String pinCode;

    public Address(int houseNo, String landMark, String city, String state, String pinCode) {
        this.houseNo = houseNo;
        this.landMark = landMark;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", landMark=" + landMark + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + '}';
    }
   
}

public class TestAssociation {

    public static void main(String[] args) {
        Address ad = new Address(101, "Hi-Tech city","Nagpur","Maharashtra","53200");
        Address ad1 = new Address(102, "Low-Tech city","Chandrpur","Maharashtra","43300");
        
        Person p=new Person("vaibhav",ad1);
        p.personDetails();

    }
}
