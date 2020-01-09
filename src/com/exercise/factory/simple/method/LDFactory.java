package com.exercise.factory.simple.method;

import com.exercise.factory.simple.model.LDBaconPizza;
import com.exercise.factory.simple.model.LDCheesePizza;
import com.exercise.factory.simple.model.Pizza;

/**
 * @Description: LD factory
 * @Date: 2020/1/9 17:58
 * @author xfei
 */
public class LDFactory extends OrderPizza {

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
