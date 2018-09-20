package org.manage.projecdt.designMode.factoryPattern.staticFactoryPattern;

/**
 * 创建产品2的工厂
 */
public class Product2Factory implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
