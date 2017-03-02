import javax.swing.*;
import java.awt.*;

/**
 * Created by mdb17 on 3/1/2017.
 */
public class apple extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);;
            g.setFont(new Font("Courier New", Font.BOLD, 50));
            g.setColor(Color.black);
            g.drawString("College Football 2017", 00, 30);

    }
}