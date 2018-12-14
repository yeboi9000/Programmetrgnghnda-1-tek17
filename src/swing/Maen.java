package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Maen extends JFrame {
	JLabel text;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();

	public Maen() { 

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		// this.setUndecorated(true);
		this.setVisible(true);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		addButtons(contentPane);
	}

	public void addButtons(Container contentPane) {
		Color greenColor = new Color(56, 150, 56);
        
		JButton closeButton = new JButton("<html> <p style='color:red'>X</p></html>");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(Color.WHITE);
		closeButton.setForeground(Color.BLACK);
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);

		text = new JLabel("hej");
		text.setBounds(50, 250, 100, 50);
		text.setForeground(Color.white);
		contentPane.add(text);

		JButton changeTextButton = new JButton("Hej");
		changeTextButton.setBounds(50, 50, 100, 50);
		changeTextButton.setBackground(Color.WHITE);
		changeTextButton.setForeground(Color.black);
		changeTextButton.addActionListener(event -> changeTextButton());
		contentPane.add(changeTextButton); 
		contentPane.repaint();

	}

	public void changeTextButton() {
		text.setText("hejdå");
		if (text.getText().equalsIgnoreCase("Hej"))
			text.setText("HEJ");
		else
			text.setText("hejdåå");
	}

	public void closeButtonPressed() {
		System.exit(0);
	}

	public static void main(String[] args) {

		Maen frame = new Maen();
		// frame.addButtons(contentPane);

	}

}
