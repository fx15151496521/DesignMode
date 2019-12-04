package com.exercise.decorator.decorator;

import com.exercise.decorator.component.Drink;

/**
 * @Description:
 * @Date: 2019/12/4 15:06
 * @author: xfei
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + drink.getDescription();
    }
}
