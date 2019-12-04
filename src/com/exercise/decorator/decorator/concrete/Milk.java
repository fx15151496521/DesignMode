package com.exercise.decorator.decorator.concrete;

import com.exercise.decorator.component.Drink;
import com.exercise.decorator.decorator.Decorator;

/**
 * @Description:
 * @Date: 2019/12/4 15:32
 * @author: xfei
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        this.setDescription("Milk");
        this.setPrice(3.0f);
    }
}
