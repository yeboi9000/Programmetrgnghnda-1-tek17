package drawing;

public class Rita {

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LinesAndShapes extends JPanel {
	 
	   //let's setup the frame so we can keep adding to our program
	   JFrame f = new JFrame("Twilight Zone");
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   f.getContentPane().add(new LinesAndShapes());
	   f.setSize(290, 325);
	   f.setLocation(550, 25);
	   f.setVisible(true);
	  }}