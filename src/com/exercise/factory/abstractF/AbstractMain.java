package com.exercise.factory.abstractF;

import com.exercise.factory.abstractF.method.HKPizzaFactory;
import com.exercise.factory.abstractF.method.OrderPizza;

/**
 * @Author: FeiXiang
 * @Description: 主函数
 * @Date: Created in 20:40 2020-01-09
 * @Modifid By:
 */
public class AbstractMain {

    public static void main(String[] args) {
        new OrderPizza(new HKPizzaFactory());
    }
}
