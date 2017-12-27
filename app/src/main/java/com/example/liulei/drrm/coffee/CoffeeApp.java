package com.example.liulei.drrm.coffee;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by liulei on 2017/12/27.
 */

public class CoffeeApp {
    @Singleton
    @Component(modules = { DripCoffeeModule.class })
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build();
        coffeeShop.maker().brew();
    }
}
