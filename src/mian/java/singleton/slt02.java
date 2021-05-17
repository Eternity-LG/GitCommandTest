package mian.java.singleton;

/*
* 饿汉式单例模式
* 另一种实例加载模式
* 不伴随类的加载而实例化
* */
public class slt02 {
    private static slt02 instance;
    static{
        instance=new slt02();
    }
    private slt02(){};
    public static slt02 getInstance(){
        return instance;
    }
}
