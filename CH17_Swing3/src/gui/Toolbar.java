package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class Toolbar extends JToolBar{

	private static final long serialVersionUID = 1L;
	
	public Toolbar(ColorChangeListener colorchanger) {
		JButton redButton=new JButton("RED");
		JButton blueButton=new JButton("BLUE");
		
		redButton.addActionListener(new ActionListener() {//익명클래스
			public void actionPerformed(ActionEvent e) {//마우스클릭시 실행
				colorchanger.changeColor(Color.RED);
			}
			
		});
		blueButton.addActionListener(e->colorchanger.changeColor(Color.BLUE));
		//람다식
		add(redButton);
		add(blueButton);
	}
}


