package org.manage.projecdt.designMode.factoryPattern.abstractFactoryPattern;

public class ConcreteProduct11 implements Product1 {
    @Override
    public void print1() {
        System.out.println(this.getClass().getName());
    }
}
