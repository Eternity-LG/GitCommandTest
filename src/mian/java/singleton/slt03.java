package mian.java.singleton;
/*
* 懒汉式
* */
public class slt03 {
    private static slt03 INSTACE;
    private slt03(){};
    public static slt03 getINSTACE(){
        if(INSTACE==null){
            INSTACE=new slt03();
        }
        return INSTACE;
    }
}
