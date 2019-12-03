package com.exercise.observer.pattern;

/**
 * @Description: 被观察对象
 * @Date: 2019/12/3 16:52
 * @author: xfei
 */
public interface Subject {

    /**
     * 将观察者注册到观察者队列当中
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者对象
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 公告通知
     */
    void notifyObserver();
}
