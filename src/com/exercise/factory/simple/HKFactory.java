package com.exercise.factory.simple;

/**
 * @Description:
 * @Date: 2020/1/9 17:59
 */
public class HKFactory extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName("HK " + orderType + " pizza");
                break;
            case "bacon":
                pizza = new BaconPizza();
                pizza.setName("HK " + orderType + " pizza");
                break;
            default:
                    break;
        }
        return pizza;
    }
}
