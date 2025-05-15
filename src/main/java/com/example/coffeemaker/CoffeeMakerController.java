package com.example.coffeemaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeMakerController {

    @Autowired
    private CoffeeMakerService coffeeMakerService;

    @PostMapping("/brew")
    public void brewCoffee() {
        coffeeMakerService.brewCoffee();
    }

    @PostMapping("/refill/water")
    public void refillWater() {
        coffeeMakerService.refillWater();
    }

    @PostMapping("/refill/beans")
    public void refillBeans() {
        coffeeMakerService.refillBeans();
    }
}
