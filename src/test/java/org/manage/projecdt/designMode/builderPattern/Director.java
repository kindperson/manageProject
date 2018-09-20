package org.manage.projecdt.designMode.builderPattern;

/**
 * 建造者模式
 * Builder模式定义: 将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示.
 * Builder模式是一步一步创建一个复杂的对象,它允许用户可以只通过指定复杂对象的类型和内容就可以构建它们.
 * 用户不知道内部的具体构建细节.Builder模式是非常类似抽象工厂模式,细微的区别大概只有在反复使用中才能体会到.
 */
public class Director {
    private Builder builder;

    //传入不同的建造者以完成不同建造者之间的替换
    public Director(Builder builder) {
        this.builder = builder;
    }
    public Product constructProduct() {
        builder.createPartA();
        builder.createPartB();
        builder.createPartC();
        return builder.build();
    }

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        Product product = director.constructProduct();
        System.out.println(product);
    }
}
