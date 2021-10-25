package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
class ColorListener implements ActionListener{
	private ColorChangeListener colorChanger;
	private Color color;
	public ColorListener(ColorChangeListener colorchanger,Color color) {
		this.colorChanger=colorChanger;
		this.color=color;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			colorChanger.changColor(color);
	}
}	



public class Toobar extends JToolBar{

	private static final long serialVersionUID = 1L;
	
	public Toobar(ColorChangeListener colorchanger) {
		JButton redButton=new JButton("RED");
		JButton blueButton=new JButton("BLUE");
		
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorchanger.changColor(Color.RED);
			}
			
		});
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorchanger.changColor(Color.BLUE);
			}
			
		});
		
		add(redButton);
		add(blueButton);
	}
}

