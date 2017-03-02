import com.siyeh.ig.ui.*;
import com.siyeh.ig.ui.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdb17 on 3/1/2017.
 */
public class Main {

    public static boolean res = false;

    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setSize(800, 620);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        apple a = new apple();
        f.add(a);




        JButton b5 = new JButton();
        b5.setLocation(200, 400);
        b5.setSize(150, 30);
        b5.setVisible(true);
        b5.setText("#5: PSU");
        f.add(b5);

        JButton b6 = new JButton();
        b6.setLocation(200, 450);
        b6.setSize(150, 30);
        b6.setVisible(true);
        b6.setText("#6: Oklahoma");



        f.add(b6);


        JButton b7 = new JButton();
        b7.setLocation(200, 500);
        b7.setSize(150, 30);
        b7.setVisible(true);
        b7.setText("#7: OSU");



        f.add(b7);

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b5) {
                    Peach p = new Peach();
                    f.getDefaultCloseOperation();
                    JFrame newF = new JFrame("Welcome!");
                    newF.setBackground(new Color(34,64,123));
                    newF.setSize(800, 620);
                    newF.setLocationRelativeTo(null);
                    newF.setVisible(true);
                    newF.add(p);
                }
            }
        });



    }
}
