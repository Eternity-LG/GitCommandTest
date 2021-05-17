package main.singleton;
/*
* 饿汉式单例模式
*
* */
public class slt01 {
    private static final slt01 instance=new slt01();
    private slt01(){};
    public static slt01 getIntance(){
        int n = 3;
        return instance;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()-> {
                System.out.println(slt01.getIntance().hashCode());

            }).start();
        }

    }

}
