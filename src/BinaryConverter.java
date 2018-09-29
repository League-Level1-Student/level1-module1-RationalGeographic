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

	void convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
		
		}
		try{
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)==('1')) {
				sum+=Math.pow(2, 7-i);
				
			}
				
			}
			
		System.out.println(sum);
			
			
			//    https://www.thecrazyprogrammer.com/wp-content/uploads/2015/11/binary-to-decimal-example.png
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			
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

		convert(text);
	}

}
