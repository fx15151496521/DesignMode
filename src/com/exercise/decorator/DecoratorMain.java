package com.exercise.decorator;

import com.exercise.decorator.component.Drink;
import com.exercise.decorator.component.concrete.Decaf;
import com.exercise.decorator.component.concrete.ShortBlack;
import com.exercise.decorator.decorator.concrete.Chocolate;
import com.exercise.decorator.decorator.concrete.Milk;

/**
 * @Description:
 * @Date: 2019/12/4 15:35
 * @author: xfei
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Drink drink1 = new Decaf();
        System.out.println(drink1.getDescription() + "---->" + drink1.cost());

        System.out.println("----------------");

        Drink drink2 = new ShortBlack();
        drink2 = new Milk(drink2);
        drink2 = new Chocolate(drink2);
        drink2 = new Milk(drink2);
        System.out.println(drink2.getDescription() + "---->" + drink2.cost());
    }
}
