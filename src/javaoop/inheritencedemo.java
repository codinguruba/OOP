
package javaoop;
//inheritence demo
class Animal{   //parent class
    String name;
    String color;
    
    public void eat(){
        System.out.println("eats...");
    }
    
    
}
class Lion extends Animal{  //child class extends parent class
    public void roar(){
        System.out.println("Lion roars...");
    }
    
    
    
}
public class inheritencedemo {
    public static void main(String[] args) {
        Lion l1 = new Lion();   //creating object
        // now the child class object acquires attributes and behaviour of parent class
        l1.name = "Musafa";
        l1.color = "Red";
        System.out.println(l1.name);
        System.out.println(l1.color);
        l1.eat();
        l1.roar();
        
        
    }
    
}
