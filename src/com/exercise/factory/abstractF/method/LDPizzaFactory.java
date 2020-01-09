package com.exercise.factory.abstractF.method;

import com.exercise.factory.simple.model.LDBaconPizza;
import com.exercise.factory.simple.model.LDCheesePizza;
import com.exercise.factory.simple.model.Pizza;

/**
 * @Author: FeiXiang
 * @Description: LD make pizza factory
 * @Date: Created in 20:48 2020-01-09
 * @Modifid By:
 */
public class LDPizzaFactory implements AbstractPizzaFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new LDCheesePizza();
                pizza.setName("LD " + orderType + " pizza");
                break;
            case "bacon":
                pizza = new LDBaconPizza();
                pizza.setName("LD " + orderType + " pizza");
                break;
            default:
                break;
        }
        return pizza;
    }
}
