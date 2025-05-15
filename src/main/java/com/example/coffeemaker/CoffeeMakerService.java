package com.example.coffeemaker;

import org.springframework.stereotype.Service;

@Service
public class CoffeeMakerService {

    public void brewCoffee() {
        System.out.println("Brewing coffee...");
    }

    public void refillWater() {
        System.out.println("Refilling water reservoir...");
    }

    public void refillBeans() {
        System.out.println("Refilling coffee beans...");
    }
}
