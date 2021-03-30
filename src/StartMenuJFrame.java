import javax.swing.*;
import java.awt.*;

public class StartMenuJFrame extends JFrame {

    StartMenuJFrame(){
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(700, 700);
        this.setVisible(true);

        ImageIcon snakeImage = new ImageIcon("Snake Icon.jpg");
        this.setIconImage(snakeImage.getImage());
        this.getContentPane().setBackground(new Color(0,0,0));
        
        
        
        
        
    }
}
