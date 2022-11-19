
package javaoop;
//Encapsulation and setters and getters code//
class Customer{
    private String name;
    private String address;
    private int cid;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCid() {
        return cid;
    }
    
    
    
}
public class Demo {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setName("Alex");
        c1.setAddress("USA");
        c1.setCid(1123);
        System.out.println(c1.getName());
        System.out.println(c1.getAddress());
        System.out.println(c1.getCid());
    }
}
