package gui;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private GamePanel gamePanel =new GamePanel();
	
	public MainFrame() {
		super("Game Of Life");
		
		setLayout(new BorderLayout()); //레이아웃
		add(gamePanel,BorderLayout.CENTER);
		
		addKeyListener(new KeyAdapter() {//키 이벤트를 대기하면서 발생시 아래
			public void keyPressed(KeyEvent e) {//키보드 키를 눌렸을때
				int code =e.getKeyCode();// 키의 종류를 숫자로 저장
				switch(code) {
				case 8:
					gamePanel.clear();
					break;
				case 32:
					gamePanel.next();
					break;
				case 10:
					gamePanel.randomize();
					break;
				}
			
			}
		});
		
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
