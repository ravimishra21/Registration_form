package Registraton;

import java.awt.*;
import javax.swing.*;

class MyWindow extends JFrame {
	
	private JLabel heading;
	Font font=new Font("",Font.BOLD,20);
	
	private JPanel mainPanel;
	private JLabel nameLabel,passwordLabel,number;
	private JTextField nameTextField,numberField;
	private JPasswordField passwordField;
	private JButton button1,button2;
	
	
//Constructor
	public MyWindow() {
		super.setTitle("Form");
		super.setSize(500,400);
		super.setLocation(300,150);
		
		 this.createGUI();
		
		 super.setVisible(true);
	}
	
	public void createGUI() {
		this.setLayout(new BorderLayout());
		heading = new JLabel("Registration Form ");
		heading.setFont(font);
		heading.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(heading,BorderLayout.NORTH);
		
//		working with panel 
		mainPanel=new JPanel();
//		setting layout of main panel
		mainPanel.setLayout(new GridLayout(4,2));
		
		nameLabel=new JLabel("Enter your name : ");
		nameLabel.setFont(font);
		
		passwordLabel = new JLabel ("Enter password ");
		passwordLabel.setFont(font);
		
		number =new JLabel("Enter Mobile No. ");
		number.setFont(font);
		
		nameTextField = new JTextField();
		nameTextField.setFont(font);
		
		passwordField = new JPasswordField();
		passwordField.setFont(font);
		
		numberField =new JTextField();
		numberField.setFont(font);
		
		button1 =new JButton("Submit");
		button1.setFont(font);
		
		button2 =new JButton("Reset");
		button2.setFont(font);
		
//		Sequence parameter in GRID Layout
		
		mainPanel.add(nameLabel);
		mainPanel.add(nameTextField);
		mainPanel.add(passwordLabel);
		mainPanel.add(passwordField);
		mainPanel.add(number);
		mainPanel.add(numberField);
		mainPanel.add(button1);
		mainPanel.add(button2);
		
//		ab is main Panel Grid layout ko BorderLayout ke center me rakhenge 
		
		this.add(mainPanel,BorderLayout.CENTER);
		
		
		
		
		
	}
}










