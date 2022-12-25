package letsgo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ButtonHanddler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg) {
		System.out.println(arg.getActionCommand());
		System.out.println("action tested");
		JLabel j = new JLabel();
		
	}
}
