package singleton;

public class LazySingleton {
    private static volatile LazySingleton instance = null;
    private LazySingleton(){
        System.out.println("����һ����������ģʽ��");
    }

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }else {
            System.out.println("�Ѿ�����һ���ˡ���");
        }
        return instance;
    }

    public void getName(){
        System.out.println("��������ģʽ");
    }

}
