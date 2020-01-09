package com.exercise.factory.abstractF.method;

import com.exercise.factory.simple.model.HKBaconPizza;
import com.exercise.factory.simple.model.HKCheesePizza;
import com.exercise.factory.simple.model.Pizza;

/**
 * @Author: FeiXiang
 * @Description:
 * @Date: Created in 20:51 2020-01-09
 * @Modifid By:
 */
public class HKPizzaFactory implements AbstractPizzaFactory {

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
