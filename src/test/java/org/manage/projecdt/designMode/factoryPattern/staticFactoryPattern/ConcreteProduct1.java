package org.manage.projecdt.designMode.factoryPattern.staticFactoryPattern;

/**
 * 产品1
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void print() {
        System.out.println(this.getClass().getName());
    }
}
