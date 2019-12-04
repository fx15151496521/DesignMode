package com.exercise.decorator.component.concrete;

import com.exercise.decorator.component.Drink;

/**
 * @Description: 咖啡抽象构建主类
 * @Date: 2019/12/4 15:05
 * @author: xfei
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
