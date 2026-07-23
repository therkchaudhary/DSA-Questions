package Polymorphism;

public class Calculator {
    int add(int a, int b){
        return a + b;
    }

    //overloading add, addition of 3 int.
    int add(int a, int b, int c){
        return a+ b + c;
    }

    double add(int a, int b, int c, double d){
        return a + b + c + d;
    }
}
