package org.manage.projecdt.designMode.factoryPattern.abstractFactoryPattern;

/**
 * 抽象工厂
 * 如果我们创建对象的方法变得复杂了,我们就将工厂类变成抽象类
 * 创建对象的方法里面且有自己的内在联系
 */
public class Test {
    public static void main(String[] args) {
        //第一大类产品创建
        Factory factory1 = new ProductFactory11();
        Product1 product11 = factory1.createProduct1();
        Product2 product21 = factory1.createProduct2();
        product11.print1();
        product21.print2();

        //第二大类产品创建
        Factory factory2 = new ProductFactory12();
        Product1 product12 = factory2.createProduct1();
        Product2 product22 = factory2.createProduct2();
        product12.print1();
        product22.print2();
    }
}
