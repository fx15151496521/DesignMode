package com.exercise.decorator.component;

/**
 * @Description: 咖啡饮料构建主类
 * @Date: 2019/12/4 15:16
 * @author: xfei
 */
public abstract class Drink {

    public String description;
    private float price;

    public String getDescription() {
        return description + "-" + this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
