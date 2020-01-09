package com.exercise.factory.simple;

import com.exercise.factory.simple.method.HKFactory;
import com.exercise.factory.simple.method.OrderPizza;

/**
 * @Description:
 * @Date: 2019/12/6 15:15
 * @author: xfei
 */
public class SimpleMain {

    public static void main(String[] args) {
        OrderPizza orderPizza = new HKFactory();
    }
}
