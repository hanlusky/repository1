package singleton;

import javax.swing.*;

public class Bajie extends JPanel {
    private static Bajie instance = new Bajie();
    public static Bajie getInstance(){
        return instance;
    }
    private  Bajie(){
        JLabel ll = new JLabel(new ImageIcon("src/main/resources/Bajie.jpg"));
        this.add(ll);
    }
}
