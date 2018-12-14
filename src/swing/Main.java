package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	JLabel text;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();

	public Main() {

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

		JButton closeButton = new JButton("Close");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(greenColor);
		closeButton.setForeground(Color.BLACK);
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);

		text = new JLabel("hej");
		text.setBounds(50, 250, 100, 50);
		text.setForeground(Color.white);
		contentPane.add(text);

		JButton changeTextButton = new JButton("hej");
		changeTextButton.setBounds(50, 50, 100, 50);
		changeTextButton.setBackground(greenColor);
		changeTextButton.setForeground(Color.black);
		changeTextButton.addActionListener(event -> changeTextButton());
		contentPane.add(changeTextButton);

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

		Main frame = new Main();
		// frame.addButtons(contentPane);

	}

}
