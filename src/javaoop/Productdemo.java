
package javaoop;


class Product{
    String name;
    int id;
    double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Price:"+price);
    }
    public void increasePrice(double amount){
        price +=amount;
        System.out.println("New price:"+price);
                
        
    }
   
}
public class Productdemo {
    public static void main(String[] args) {
        Product ob = new Product("Shampoo",1127,200);
        ob.show();
        ob.increasePrice(20);
            
        
    }
}
