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
		
		redButton.addActionListener(new ActionListener() {//�͸�Ŭ����
			public void actionPerformed(ActionEvent e) {//���콺Ŭ���� ����
				colorchanger.changeColor(Color.RED);
			}
			
		});
		blueButton.addActionListener(e->colorchanger.changeColor(Color.BLUE));
		//���ٽ�
		add(redButton);
		add(blueButton);
	}
}


