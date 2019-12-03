# DesignMode
create project for design mode

策略模式：分别封装行为接口，实现算法族，超累里放行为接口对象，在子类中具体设定行为对象。
原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为算法的变化独立于算法
的使用者.

总结：

- 分析项目中变化部分与不变化部分
- 多用组合少用继承；用行为类组合，而不是行为的继承。更有弹性
- 设计模式没有相应的库直接使用。有些库或框架本身就是用某种模式设计的
- 如果找不到使用的模式怎么办：可能是对项目的分析不够透彻。实在不行只能用笨方法做

观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为Subject，依赖的对象为Observer，
Subject通知Observer变化

可以使用java的内置观察者模式：

意义：松耦合，高内聚，隔离影响的意义

注意：因为内置的观察者模式是各一个抽象类而不是接口，所以只能单继承。