package javaoop;

class Calculation {

    int sum;
    int product;

    public void sum(int a, int b) {
        sum = a + b;
        System.out.println("sum:" + sum);

    }

    public void product(int a , int b) {
        product = a*b;
        System.out.println("Product:"+product);

    }
}

public class Main {

    public static void main(String[] args) {
        Calculation c1 = new Calculation();
        c1.sum(5,4);
        c1.product(5,3);
        

    }
}
