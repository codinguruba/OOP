package javaoop;

class Cal {

    public void add() {
        int a = 5;
        int b = 10;
        System.out.println(a + b);

    }

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }

    public int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;

    }

}

public class methodoverloading {
    public static void main(String[] args) {
        Cal c1 = new Cal();
        c1.add();
        c1.add(5, 4);
        System.out.println(c1.add(5, 4, 1));

    }
}
