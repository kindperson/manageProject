package org.manage.projecdt.designMode.factoryPattern.staticFactoryPattern;

/**
 * 产品2
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void print() {
        System.out.println(this.getClass().getName());
    }
}
