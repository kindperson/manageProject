package org.manage.projecdt.designMode.SingletonPattern;

public class Product {
    //注意此处一定要使用volatile关键字，volatile关键字可以禁止指令重排，因为new Product()不是一个原子操作
    public static volatile Product product;

    private Product() {
    }

    public static Product getInstance() {
        if (null == product) {
            synchronized (Product.class) {
                if (null == product) {// 第二重检测
                    product = new Product();
                }
            }
        }
        return product;
    }

    /**
     * Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。 在很多操作中，比如建立目录,
     * 数据库连接都需要这样的单线程操作。 还有, singleton能够被状态化; 这样多个单态类在一起就可以作为一个状态仓库一样向外提供服务,
     * 比如，你要论坛中的帖子计数器，每次浏览一次需要计数，
     * 单态类能否保持住这个计数，并且能synchronize的安全自动加1，如果你要把这个数字永久保存到数据库，
     * 你可以在不修改单态接口的情况下方便的做到。 另外方面，Singleton也能够被无状态化。提供工具性质的功能，
     * Singleton模式就为我们提供了这样实现的可能。使用Singleton的好处还在于可以节省内存，因为它限制了实例的个数，
     * 有利于Java垃圾回收（garbage collection）。 我们常常看到工厂模式中类装入器(class loader)中也用Singleton模式实现的,
     * 因为被装入的类实际也属于资源。
     * @param args
     */
    public static void main(String[] args) {
        Product product = Product.getInstance();
    }
}
