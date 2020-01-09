package com.exercise.factory.abstractF.method;

import com.exercise.factory.simple.model.Pizza;

/**
 * @Author: FeiXiang
 * @Description: pizza抽象接口
 * @Date: Created in 20:42 2020-01-09
 * @Modifid By:
 */
public interface AbstractPizzaFactory {

    /**
     * 创建披萨的抽象接口
     * @param orderType pizza type
     * @return
     */
    Pizza createPizza(String orderType);
}
