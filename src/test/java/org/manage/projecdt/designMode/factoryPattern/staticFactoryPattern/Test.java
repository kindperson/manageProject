package org.manage.projecdt.designMode.factoryPattern.staticFactoryPattern;

/**
 * 静态工厂/简单工厂
 * 为什么工厂模式是如此常用？因为工厂模式就相当于创建实例对象的new，我们经常要根据类Class生成实例对象，如A a=new A()
 * 工厂模式也是用来创建实例对象的，所以以后new时就要多个心眼，是否可以考虑实用工厂模式，虽然这样做，可能多做一些工作，
 * 但会给你系统带来更大的可扩展性和尽量少的修改量。 我们以类Sample为例， 如果我们要创建Sample的实例对象: Sample sample=new Sample();
 * 可是，实际情况是，通常我们都要在创建sample实例时做点初始化的工作,比如赋值 查询数据库等。 首先，我们想到的是，可以使用Sample的构造函数，
 * 这样生成实例就写成: Sample sample=new Sample(参数); 但是，如果创建sample实例时所做的初始化工作不是象赋值这样简单的事，
 * 可能是很长一段代码，如果也写入构造函数中，那你的代码很难看了（就需要Refactor重整）。 为什么说代码很难看，初学者可能没有这种感觉，
 * 我们分析如下，初始化工作如果是很长一段代码，说明要做的工作很多，将很多工作装入一个方法中，相当于将很多鸡蛋放在一个篮子里，
 * 是很危险的，这也是有背于Java面向对象的原则，面向对象的封装(Encapsulation)和分派(Delegation)告诉我们，
 * 尽量将长的代码分派“切割”成每段，将每段再“封装”起来(减少段和段之间偶合联系性)，这样，就会将风险分散，
 * 以后如果需要修改，只要更改每段，不会再发生牵一动百的事情。 在本例中，首先，我们需要将创建实例的工作与使用实例的工作分开,
 * 也就是说，让创建实例所需要的大量初始化工作从Sample的构造函数中分离出去。 这时我们就需要Factory工厂模式来生成对象了，
 * 不能再用上面简单new Sample(参数)。还有,如果Sample有个继承如MySample, 按照面向接口编程,我们需要将Sample抽象成一个接口.
 * 现在Sample是接口,有两个子类MySample 和HisSample .我们要实例化他们时,如下:
 * Sample mysample=new MySample(); Sample hissample=new HisSample(); 随着项目的深入,Sample可能还会"生出很多儿子出来",
 * 那么我们要对这些儿子一个个实例化,更糟糕的是,可能还要对以前的代码进行修改:加入后来生出儿子的实例.这在传统程序中是无法避免的.
 * 但如果你一开始就有意识使用了工厂模式,这些麻烦就没有了.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory1 = new Product1Factory();
        Product product1 = factory1.createProduct();
        product1.print();
        Factory factory2 = new Product2Factory();
        Product product2 = factory2.createProduct();
        product2.print();
    }
}
