
package javaoop;

class Person{
   private String name;
   private String address;
   private int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
    
    
}

public class Persondemo {
    public static void main(String[] args) {
        Person ob = new Person("Alex","Sukedhara",18);
        System.out.println(ob.getName());
        System.out.println(ob.getAddress());
        System.out.println(ob.getAge());
        
    }
}
