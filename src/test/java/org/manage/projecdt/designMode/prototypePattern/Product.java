package org.manage.projecdt.designMode.prototypePattern;

/**
 * 原型模式
 * 用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象.
 * Prototype模式允许一个对象再创建另外一个可定制的对象，根本无需知道任何如何创建的细节,工作原理是:
 * 通过将一个原型对象传给那个要发动创建的对象，
 * 这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建。
 * 1：浅拷贝
 * 只能拷贝基本类型（包含String），无法拷贝引用类型
 */
public class Product implements Cloneable {

    //必须实现Cloneable接口，此接口只是一个声明接口
    private Integer id;
    private String name;

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //此处省略get，set方法
    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "name1");
        System.out.println(p1 + "    id:" + p1.getId() + ",name:" + p1.getName());
        try {
            Product p2 = p1.clone();
            System.out.println(p2 + "    id:" + p2.getId() + ",name:" + p2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
