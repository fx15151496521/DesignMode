package com.exercise.decorator.decorator.concrete;

import com.exercise.decorator.component.Drink;
import com.exercise.decorator.decorator.Decorator;

/**
 * @Description:
 * @Date: 2019/12/4 15:33
 * @author: xfei
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        this.setDescription("Chocolate");
        this.setPrice(3.0f);
    }
}
