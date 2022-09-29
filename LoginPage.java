import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage {
	
	JFrame frame = new JFrame();
	JLabel userLabel = new JLabel("User : ");
	JLabel passLabel = new JLabel("Password : ");
	JTextField userField = new JTextField();
	JPasswordField passField = new JPasswordField();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JLabel message = new JLabel();
	
	
	LoginPage(HashMap<String, String> loginIDandPass) {
		
		frame.setTitle("Login Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(450, 450);
		frame.setLayout(null);
		
		userLabel.setBounds(85, 75, 100, 25);
		passLabel.setBounds(85, 110, 100, 25);
		
		message.setBounds(50, 200, 350, 50);
		message.setFont(new Font(null, Font.BOLD, 30));
		message.setForeground(Color.GREEN);
		
		userField.setBounds(160, 75, 200, 25);
		passField.setBounds(160, 110, 200, 25);
		
		loginButton.setBounds(160, 150, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == loginButton) {
					
					String userId = userField.getText();
					String pass = String.valueOf(passField.getPassword());
					
					if(loginIDandPass.containsKey(userId)) {
						if(loginIDandPass.get(userId).equals(pass)) {
							
							message.setText("Succesfull login");
							frame.dispose();
							new WelcomePage(userId);
						}
						else {
							message.setForeground(Color.red);
							message.setText("Incorrect Password :(");
						}
					}
					else {
						message.setForeground(Color.red);
						message.setText("Incorrect ID :(");
					}
				}
			}
			
			
		});
		
		
		resetButton.setBounds(260, 150, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(e -> {
			userField.setText("");
			passField.setText("");
		});
		
		frame.add(message);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(userField);
		frame.add(passField);
		frame.add(userLabel);
		frame.add(passLabel);
		frame.setVisible(true);
	}
}