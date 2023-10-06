package com.kristoffer.demo;

// Implement to inherit interface
public class Cat implements Animal {

    // Override, takes a method, makes it unique
    // AKA Polymorphism
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
