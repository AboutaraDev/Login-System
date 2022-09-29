import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
    JFrame frame = new JFrame();
    JLabel helloLabel = new JLabel();
    
    WelcomePage(String name) {
    	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	frame.setSize(450, 450);
    	
    	helloLabel.setBounds(150, 150, 100, 50);
    	helloLabel.setFont(new Font("Ink Free", Font.PLAIN, 50));
    	helloLabel.setText("Salam "+ name);
    	
    	frame.add(helloLabel);
    	frame.setVisible(true);
    }
    
}
