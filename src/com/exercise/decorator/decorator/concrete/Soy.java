package com.exercise.decorator.decorator.concrete;

import com.exercise.decorator.component.Drink;
import com.exercise.decorator.decorator.Decorator;

/**
 * @Description:
 * @Date: 2019/12/4 15:30
 * @author: xfei
 */
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
        this.setDescription("Soy");
        this.setPrice(2.0f);
    }
}
