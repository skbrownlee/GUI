import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUITest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Dark Wave");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(600, 400);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		FlowLayout layout = new FlowLayout();
		
		frame.setLayout(layout);
		
		JButton b1 = new JButton("I am a man who stares");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame textFrame = new JFrame("Note...");
				FlowLayout textLayout = new FlowLayout();
				JTextField text = new JTextField("Stop Staring...");
				textFrame.setLayout(layout);
				textFrame.add(text);
				textFrame.pack();
				textFrame.setVisible(true);
				textFrame.setLocation((int)(Math.random() * 200), (int)(Math.random()* 200));
			}
			
		});
		
		frame.add(b1);
		frame.pack();
	}

}
