import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		int outputone = 0;
		int outputtwo = 0;
		int outputthree = 0;
		int outputfour = 0;
		int outputfive = 0;
		int outputsix =  0;
		int outputseven = 0;
		int outputeight = 0;
		
		try {
			
			int eight = input.charAt(7);
			int seven = input.charAt(6);
			int six = input.charAt(5);
			int five = input.charAt(4);
			int four = input.charAt(3);
			int three = input.charAt(2);
			int two = input.charAt(1);
			int one = input.charAt(0);
			
			if(one==1) {
				 outputone = 1;
			}
			else if ( one==0) {
				  outputone = 0;
			}
			if(two==1) {
				 outputtwo = 1;
			}
			else if ( two==0) {
				  outputtwo = 0;
			}
			if(three==1) {
				 outputthree = 1;
			}
			else if ( three==0) {
				  outputthree = 0;
			}
			if(four==1) {
				 outputfour = 1;
			}
			else if ( four==0) {
				  outputfour = 0;
			}if(five==1) {
				 outputfive = 1;
			}
			else if ( five==0) {
				 outputfive = 0;
			}
			if(six==1) {
				 outputsix = 1;
			}
			else if ( six==0) {
				  outputsix = 0;
			}if(seven==1) {
				 outputseven = 1;
			}
			else if ( seven==0) {
				  outputseven = 0;
			}
			if(eight==1) {
				 outputeight = 1;
			}
			else if ( eight==0) {
				  outputeight = 0;
			}
			if(outputone==1) {
				int newcon = 1+(2*0);
			}
			if(outputtwo==1) {
				int newcon2 = 1*(2*1)
			}
			if(outputthree==1) {
				int newcon3 = 
			
			//    https://www.thecrazyprogrammer.com/wp-content/uploads/2015/11/binary-to-decimal-example.png
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}


	public static void main(String[] args) {

		BinaryConverter biguy = new BinaryConverter();

		biguy.newui();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label2 = new JLabel();
	JTextField answer = new JTextField(20);
	JButton button = new JButton("convert");

	private void newui() {

		frame.setTitle("binary boi");

		frame.add(panel);
		frame.show();
		answer.show();

		button.addActionListener(this);

		button.show();
		panel.add(answer);
		panel.add(button);

		label2.show();
		label2.setText("a");
		frame.setSize(100, 50);
		panel.add(label2);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String text = answer.getText();

		System.out.println(convert(text));
	}

}
