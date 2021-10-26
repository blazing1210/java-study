package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import model.World;
public class GamePanel extends JPanel {
	private static final long serialVersionUID=1L;
	
	private final static int CELLSIZE=100;//������ ũ�⼳��
	private final static Color backgroundColor= Color.BLACK;//���� ������
	private final static Color gridColor = Color.GRAY;//���ڼ��� ȸ��
	private int leftRightMargin;
	private int topBottomMargin;
	private World world;
	 
	public GamePanel() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getY()<topBottomMargin||e.getX()<leftRightMargin) {
					return;//������̱⶧���� ����
				}
				int row=(e.getY()-topBottomMargin)/CELLSIZE;
				int col=(e.getX()-leftRightMargin)/CELLSIZE;
				if(row>=world.getRows()||col>=world.getColumns()) {
					return;
				}
				boolean status=world.getCell(row, col);
				world.setCell(row, col, !status);
				
				
				repaint();//���ΰ�ħ
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2=(Graphics2D)g;//2D�׷����� ����ϱ� ����
		int width = getWidth();//���α���
		int height = getHeight();//���α���
		
		leftRightMargin=((width%CELLSIZE)+CELLSIZE)/2;
		topBottomMargin=((height%CELLSIZE)+CELLSIZE)/2;
		
		int rows=(height-2*topBottomMargin)/CELLSIZE;
		int cols=(width-2*leftRightMargin)/CELLSIZE;
		if(world==null) {
			world=new World(rows,cols);
		}
		
		//grid���߹迭�� ��ǥ���� true�� set
		
		g2.setColor(backgroundColor);//������
		g2.fillRect(0,0,width,height);//�簢���� ��ǥ�� ���� ĥ��
		
		drawGrid(g2,width,height);//���� �ߴ� �޼ҵ�
		for(int col=0;col<cols;col++) {
			for(int row=0;row<rows; row++) {
				boolean status = world.getCell(row, col);
				fillCell(g2,row,col,status);
			}
		}
		
	}
	private void fillCell(Graphics g2,int row,int col,boolean status) {
		//�簢���� ���� �ִ� �޼ҵ�(�׷���,����,����,����(true���,false����)
		Color color = status ? Color.GREEN:backgroundColor;
		g2.setColor(color);
		int x= leftRightMargin+(col*CELLSIZE);
		int y= topBottomMargin+(row*CELLSIZE);
		g2.fillRect(x+1,y+1,CELLSIZE-1,CELLSIZE-1);
		
	}
	private void drawGrid(Graphics2D g2,int width, int height) {
		g2.setColor(gridColor);
		for(int x=leftRightMargin;x<=width-leftRightMargin;x+=CELLSIZE) {
			//���� �ߴ� �޼ҵ� (x,y) (x2,y2)
			g2.drawLine(x,topBottomMargin,x,height-topBottomMargin);
		}
		for(int y=topBottomMargin;y<=width-topBottomMargin;y+=CELLSIZE) {
			//���� �ߴ� �޼ҵ� (x,y) (x2,y2)
			g2.drawLine(leftRightMargin,y,width-leftRightMargin,y);
		}
	}
}
