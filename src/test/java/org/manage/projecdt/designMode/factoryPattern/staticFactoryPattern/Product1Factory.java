package org.manage.projecdt.designMode.factoryPattern.staticFactoryPattern;

/**
 * 创建产品1的工厂
 */
public class Product1Factory implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
