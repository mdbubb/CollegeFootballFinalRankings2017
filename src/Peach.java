import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by mdb17 on 3/1/2017.
 */
public class Peach extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        ImageIcon i = new ImageIcon("back1.jpg");
        g.drawImage(i.getImage(),0,0,null);


        g.setColor(Color.white);
        g.setFont(new Font("Courier New",  Font.BOLD, 50));
        g.drawString("B1G CHAMPS",0,100);
        g.drawString("ROSE BOWL RUNNER UP",0,200);







    }
}
