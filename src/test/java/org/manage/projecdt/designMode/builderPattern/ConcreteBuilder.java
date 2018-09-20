package org.manage.projecdt.designMode.builderPattern;

public class ConcreteBuilder implements Builder {
    private String partA;
    private String partB;
    private String partC;

    //此处可以使用工厂方法或者静态工厂实现各个部分的创建
    @Override
    public void createPartA() {
        this.partA = "partA";
    }
    @Override
    public void createPartB() {
        this.partB = "partB";
    }
    @Override
    public void createPartC() {
        this.partC = "partC";
    }

    @Override
    public Product build() {
        Product product = new Product();
        product.setPartA(partA);
        product.setPartB(partB);
        product.setPartC(partC);
        return product;
    }
}
