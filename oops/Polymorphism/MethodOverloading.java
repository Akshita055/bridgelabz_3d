package Polymorphism;

public class MethodOverloading {
    // Method Overloading:

// Same method name, but different parameter lists (number, type, or order of parameters) within the same class.
// Happens at compile time.
// Can have different return types.
// Used to increase the readability of the program.
    public void add(int a,double b){
        System.out.println(a+b);
    }
    public int add(double a,int b){
        return (int)(a+b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(5,6.5);
        int result = obj.add(5.5,6);
        System.out.println(result);
    }
}
