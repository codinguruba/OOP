
package javaoop;

class Account{
    private String name;
    private int aid;

    public Account(String name, int aid) {
        this.name = name;
        this.aid = aid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public int getAid() {
        return aid;
    }
    
    
    
    
    
}
public class Example {
    public static void main(String[] args) {
        Account ob = new Account("Alex Shah",2231);
        System.out.println(ob.getName());
        System.out.println(ob.getAid());
    }
}
