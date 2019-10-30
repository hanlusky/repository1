package singleton;

public class LazySingleton {
    private static volatile LazySingleton instance = null;
    private LazySingleton(){
        System.out.println("产生一个懒汉单例模式！");
    }

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }else {
            System.out.println("已经产生一个了。。");
        }
        return instance;
    }

    public void getName(){
        System.out.println("我是懒汉模式");
    }

}
