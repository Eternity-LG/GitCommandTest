package main.�հ�;

public class BiBao {
    public static void main(String[] args) {
        //1.�򻯲������ͣ����Բ�д�������ͣ����Ǳ������в�������д
        NoReturnMultiParam lamdba1 = (a, b) -> {
            System.out.println("�򻯲�������");
        };
        lamdba1.method(1, 2);

        //2.�򻯲���С���ţ����ֻ��һ�����������ʡ�Բ���С����
        NoReturnOneParam lambda2 = a -> System.out.println("�򻯲���С����");
        lambda2.method(1);

        //3.�򻯷���������ţ����������ֻ��һ����䣬�����ʤ�ʷ����������
        NoReturnNoParam lambda3 = () -> System.out.println("�򻯷����������");
        lambda3.method();

        //4.���������ֻ��һ����䣬������ return ��䣬�����ʡ�Է����������
        ReturnOneParam lambda4 = a -> a + 3;
        System.out.println(lambda4.method(5));

        ReturnMultiParam lambda5 = (a, b) -> a + b;
        System.out.println(lambda5.method(1, 1));

        //*****************************************����ʵ����ķ���******************************************//
        ReturnOneParam lambda1 = a -> doubleNum(a);
        System.out.println(lambda1.method(3));

        //lambda2 �������Ѿ�ʵ�ֵ� doubleNum ����
        ReturnOneParam lambda22 = BiBao::doubleNum;
        //System.out.println(lambda22.method(3));

        BiBao exe = new BiBao();

        //lambda4 �������Ѿ�ʵ�ֵ� addTwo ����
        ReturnOneParam lambda44 = exe::addTwo;
        System.out.println(lambda4.method(2));
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        });
        thread1.start();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        });
        thread.start();
    }


    //****************************************�ӿ�*******************************************//

    /**
     * ������޷���
     */
    @FunctionalInterface
    public interface NoReturnMultiParam {
        void method(int a, int b);
    }

    /**
     * �޲��޷���ֵ
     */
    @FunctionalInterface
    public interface NoReturnNoParam {
        void method();
    }

    /**
     * һ�������޷���
     */
    @FunctionalInterface
    public interface NoReturnOneParam {
        void method(int a);
    }

    /**
     * ��������з���ֵ
     */
    @FunctionalInterface
    public interface ReturnMultiParam {
        int method(int a, int b);
    }

    /*** �޲��з���*/
    @FunctionalInterface
    public interface ReturnNoParam {
        int method();
    }

    /**
     * һ�������з���ֵ
     */
    @FunctionalInterface
    public interface ReturnOneParam {
        int method(int a);
    }

    /**
     * Ҫ��
     * 1.��������������Ҫ��ӿ��ж����һ��
     * 2.����ֵ����Ҫ��ӿ��ж����һ��
     */
    public static int doubleNum(int a) {
        return a * 2;
    }

    public int addTwo(int a) {
        return a + 2;
    }
}
