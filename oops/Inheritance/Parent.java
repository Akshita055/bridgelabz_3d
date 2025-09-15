package Inheritance;

public class Parent {

    Parent() {

            System.out.println("Parent class constructor called");
    }
    Parent(int a){
        this();
        System.out.println(a); 
    }
}
