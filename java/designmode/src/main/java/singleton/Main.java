package singleton;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        LazySingleton ls1 = LazySingleton.getInstance();
        ls1.getName();

        LazySingleton ls2 = LazySingleton.getInstance();
        ls2.getName();
        if(ls1==ls2){
            System.out.println("ͬһ��");
        }else {
            System.out.println("����ͬһ��");
        }

        System.out.println("------------------------");

        JFrame jf=new JFrame("��������ģʽ����");
        jf.setLayout(new GridLayout(1,2));
        Container contentPane=jf.getContentPane();
        Bajie obj1=Bajie.getInstance();
        contentPane.add(obj1);
        Bajie obj2=Bajie.getInstance();
        contentPane.add(obj2);
        if(obj1==obj2)
        {
            System.out.println("������ͬһ�ˣ�");
        }
        else
        {
            System.out.println("���ǲ���ͬһ�ˣ�");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
