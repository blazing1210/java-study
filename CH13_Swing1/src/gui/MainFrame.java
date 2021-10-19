package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title);//JFrame�� Ÿ��Ʋ�� �����ϵ���.
		
		setLayout(new BorderLayout());
		
		add(new Toobar(),BorderLayout.NORTH);
		add(new MainPanel(),BorderLayout.CENTER);
		
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
