package com.exercise.factory.abstractF.method;

import com.exercise.factory.simple.model.Pizza;

import java.util.Scanner;

/**
 * @Author: FeiXiang
 * @Description: pizza 下单实体
 * @Date: Created in 20:56 2020-01-09
 * @Modifid By:
 */
public class OrderPizza {

    public AbstractPizzaFactory pizzaFactory = null;

    public OrderPizza(AbstractPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
        setPizzaType();
    }

    public void setPizzaType() {
        Pizza pizza = null;
        while (true) {
            String orderType = getOrderType();
            pizza = this.pizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.cut();
            } else {
                System.out.println("The type is not in pizza's type range!");
            }
        }
    }

    public String getOrderType() {
        Scanner scanner = new Scanner(System.in);
        String orderType = scanner.nextLine();
        return orderType;
    }
}
