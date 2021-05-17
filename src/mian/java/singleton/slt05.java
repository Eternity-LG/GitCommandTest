package mian.java.singleton;

/*
* 懒汉式
* sychronized锁代码块
* */
public class slt05 {

        private  static slt05 INSTANCE;
        private slt05(){};
        public static  slt05 getInstance(){

            if(INSTANCE==null){
                synchronized (slt05.class){
                    INSTANCE=new slt05();
                }
            }
            return INSTANCE;
        }

}
