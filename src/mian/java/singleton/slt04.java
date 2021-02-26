package mian.java.singleton;

/*
* 懒汉式
* sychronized锁静态方法
* */
public class slt04 {
    private  static slt04 INSTANCE;
    private slt04(){};
    public static synchronized slt04 getInstance(){
        if(INSTANCE==null){
            INSTANCE=new slt04();
        }
        return INSTANCE;
    }
}
