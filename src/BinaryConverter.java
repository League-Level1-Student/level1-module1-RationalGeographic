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
		try {
			
			int eight = input.charAt(1);
			int seven = input.charAt(2);
			int six = input.charAt(3);
			int five = input.charAt(4);
			int four = input.charAt(5);
			int three = input.charAt(6);
			int two = input.charAt(7);
			int one = input.charAt(8);
			
			if(one==1) {
				int outputone = 1;
			}
			else if ( one==0) {
				 int outputone = 0;
			}
			if()
			
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
