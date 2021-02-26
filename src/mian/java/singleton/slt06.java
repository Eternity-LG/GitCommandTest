package mian.java.singleton;

/*
* 懒汉式
* 双重锁检定机制
* */
public class slt06 {
    private static volatile slt06 INSTANCE;
    private slt06(){};
    public static slt06 getInstance(){
        if(INSTANCE==null){

            synchronized (slt06.class){
                if (INSTANCE==null){
                    INSTANCE=new slt06();
                }
            }
        }

        return INSTANCE;
    }
}
