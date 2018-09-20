package org.manage.projecdt.designMode.prototypePattern;

public class OtherProduct implements Cloneable{

    //此处省略get，set方法
    @Override
    protected OtherProduct clone() throws CloneNotSupportedException {
        OtherProduct clone = (OtherProduct) super.clone();
        return clone;
    }
}
