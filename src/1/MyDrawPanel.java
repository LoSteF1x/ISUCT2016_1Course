import java.awt.*;
import javax.swing.*;
/**
 * Created by stud_6 on 25.03.17.
 */
public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }
}

