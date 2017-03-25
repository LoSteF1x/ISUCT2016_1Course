import javax.swing.*;

/**
 * Created by stud_6 on 25.03.17.
 */
public class Interface {

        public static void main (String[] args ) {
            JFrame frame = new JFrame();
            JButton button = new JButton("click me");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(button);
            frame.setSize(300,300);
            frame.setVisible(true);

        }

    }




