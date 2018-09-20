package org.manage.projecdt.designMode.builderPattern;

public interface Builder {
    //创建产品的各个部分，此处可以在具体的建造者中使用工厂方法或者静态工厂来实现产品的各个部分
    public void createPartA();
    public void createPartB();
    public void createPartC();

    //创建产品
    public Product build();
}
