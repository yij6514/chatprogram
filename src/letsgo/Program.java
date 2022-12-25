package letsgo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Program extends JFrame{
	public Program(String title){
		Container c = getContentPane();
		setTitle(title);
		setSize(600,720);
		setResizable(false);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel upper = new JPanel();
		JPanel center = new JPanel();
		JPanel down = new JPanel();
		
		JLabel towhom = new JLabel("받는 이");
		upper.add(towhom);
		
		center.setLayout(new GridLayout(0,2));
		JTextArea bull = new JTextArea();
		bull.setEditable(false);
		center.add(bull);
		
		down.setLayout(new BorderLayout());
		JButton check = new JButton("전송");
		JTextField textbox = new JTextField();
		down.add(check,BorderLayout.EAST);
		down.add(textbox,BorderLayout.CENTER);
		textbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = textbox.getText();
				System.out.println(data);
				bull.append(data + "\n");
				textbox.setText("");
				JLabel newtext = new JLabel(data);
				center.add(newtext);
			}
		});
		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = textbox.getText();
				System.out.println(data);
				bull.append(data + "\n");
				textbox.setText("");
				JLabel newtext = new JLabel(data);
				center.add(newtext);
			}
		});
		
		
		add(upper,BorderLayout.NORTH);
		add(center,BorderLayout.CENTER);
		add(down,BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
	
	
}
