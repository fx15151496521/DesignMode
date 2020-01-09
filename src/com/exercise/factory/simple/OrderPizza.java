package com.exercise.factory.simple;

import java.util.Scanner;

/**
 * @Description: simple factory order pizza
 * @Date: 2020/1/9 17:11
 * @author xfei
 */
public abstract class OrderPizza {

    public OrderPizza() {
        setPizzaType();
    }

    public void setPizzaType() {
        String orderType = null;

        while (true) {
            orderType = getOrderType();
            Pizza pizza = this.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("The type is not in the pizza type range!");
            }
        }
    }

    public abstract Pizza createPizza(String orderType);

    public String getOrderType() {
        Scanner scanner = new Scanner(System.in);
        String orderType = scanner.nextLine();
        return orderType;
    }
}
