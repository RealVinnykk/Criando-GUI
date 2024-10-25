
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

            ImageIcon image = new ImageIcon("/home/vinny/Downloads/kauer.jpg");
            JFrame frame = new JFrame();
            JPanel blackPanel = new JPanel();
            JPanel redPanel = new JPanel();
            JPanel greenPanel = new JPanel();
            JLabel label = new JLabel();

            label.setIcon(image);
            label.setVisible(true);
            label.setSize(image.getIconWidth(),image.getIconHeight());
            label.setSize(500,500);
            label.setVerticalAlignment(SwingConstants.CENTER);
            label.setHorizontalAlignment(SwingConstants.CENTER);

            greenPanel.setBackground(Color.green);
            greenPanel.setBounds(250,0,250,250);


            redPanel.setBackground(Color.red);
            redPanel.setBounds(0,0,250,250);

            blackPanel.setBackground(Color.black);
            blackPanel.setBounds(0,250, 500,250) ;


            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(750,750);
            frame.setTitle("eita");
            frame.setVisible(true);
            frame.setLayout(null);
            //frame.add(blackPanel);
            //frame.add(redPanel);
            //frame.add(greenPanel);
            frame.add(label);
    }
}