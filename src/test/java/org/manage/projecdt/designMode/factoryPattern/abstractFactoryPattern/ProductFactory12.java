package org.manage.projecdt.designMode.factoryPattern.abstractFactoryPattern;

public class ProductFactory12 implements Factory {
    @Override
    public Product1 createProduct1() {
        return new ConcreteProduct12();
    }

    @Override
    public Product2 createProduct2() {
        return new ConcreteProduct22();
    }
}
