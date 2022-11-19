
package javaoop;

class Employee{
    String name;
    String address;
    int age;

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
    }
}

public class Constructordemo {
    public static void main(String[] args) {
        Employee ob = new Employee("Alex Shah","Sukedhara",18);
        ob.show();
    }
}
