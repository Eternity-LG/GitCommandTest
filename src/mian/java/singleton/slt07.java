package mian.java.singleton;
/*
* 懒汉式
* 内部类加载
* */
public class slt07 {

    private slt07(){};
     static class slt07Holder{
         private static slt07  INSTANCE=new slt07();
    }
    public slt07 getInstance(){
         return slt07Holder.INSTANCE;
    }
}
