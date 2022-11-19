
package javaoop;

class Cat{
    String name = "Shinchan";
    String color = "White";
    
    public void meow(){
        System.out.println("Cat makes noise");
    }
}
public class Testclass {
    public static void main(String[] args) {
        Cat ob = new Cat();
        System.out.println(ob.name);
        System.out.println(ob.color);
        ob.meow();
        
    }
}
