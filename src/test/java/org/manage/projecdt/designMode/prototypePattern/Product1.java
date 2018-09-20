package org.manage.projecdt.designMode.prototypePattern;

/**
 * 2:深拷贝
 * 所有引用类型都实现Cloneable并重写clone方法，然后一层一层拷贝下去即深拷贝（包含集合和任意类）
 */
//必须实现Cloneable接口，此接口只是一个声明接口
public class Product1 implements Cloneable {
    private Integer id;
    private String name;
    private OtherProduct otherProduct;

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

    public OtherProduct getOtherProduct() {
        return otherProduct;
    }

    public void setOtherProduct(OtherProduct otherProduct) {
        this.otherProduct = otherProduct;
    }

    public Product1(Integer id, String name, OtherProduct otherProduct) {
        this.id = id;
        this.name = name;
        this.otherProduct = otherProduct;
    }
    //此处省略get，set方法
    @Override
    protected Product1 clone() throws CloneNotSupportedException {
        Product1 clone = (Product1) super.clone();
        //此处拷贝引用类型，说白了就是所有引用类型都实现Cloneable并重写clone方法，然后一层一层拷贝下去即深拷贝
        clone.setOtherProduct(otherProduct.clone());
        return clone;
    }

    public static void main(String[] args) {
        Product1 p1 = new Product1(1, "name1", new OtherProduct());
        System.out.println(
                p1 + "    id:" + p1.getId() + ",name:" + p1.getName() + ",otherProduct:" + p1.getOtherProduct());
        try {
            Product1 p2 = p1.clone();
            System.out.println(
                    p2 + "    id:" + p2.getId() + ",name:" + p2.getName() + ",otherProduct:" + p2.getOtherProduct());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}