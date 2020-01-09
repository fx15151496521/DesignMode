package com.exercise.factory.simple.method;

import com.exercise.factory.simple.model.HKBaconPizza;
import com.exercise.factory.simple.model.HKCheesePizza;
import com.exercise.factory.simple.model.Pizza;

/**
 * @Description: HK factory
 * @Date: 2020/1/9 17:59
 * @author xfei
 */
public class HKFactory extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new HKCheesePizza();
                pizza.setName("HK " + orderType + " pizza");
                break;
            case "bacon":
                pizza = new HKBaconPizza();
                pizza.setName("HK " + orderType + " pizza");
                break;
            default:
                    break;
        }
        return pizza;
    }
}
