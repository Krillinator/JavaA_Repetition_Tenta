package com.kristoffer.demo;

public class Main {

    // Starting Point
        // does 'main' have to be named 'main'?
            // YES - A (TRUE)
            // NO - B
    public static void main(String[] args) {

        // Class names?
            // A - GOOD
            // b - BAD

        // Question #1
        String a;
        String b = null;

        // return
        String greeting = myGreeting("Hello world!");

        // Objects
        MyReturns myReturns = new MyReturns();  // Instantiation
        Calculator myCalculator = new Calculator();

        // Made possible with return
        int sum = myCalculator.addition(2, 2);

        System.out.println(myCalculator.addition(2, 2));
        System.out.println(myReturns.sayHello());

        // Inheritance
        Cat kasper = new Cat();
        Dog leif = new Dog();

        kasper.speak();
        leif.speak();

    }

    public static String myGreeting(String greeting) {

        return greeting;
    }

}
