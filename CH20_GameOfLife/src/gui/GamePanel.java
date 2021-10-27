package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import model.World;
public class GamePanel extends JPanel {
	private static final long serialVersionUID=1L;
	
	private final static int CELLSIZE=50;//격자의 크기설정
	private final static Color backgroundColor= Color.BLACK;//배경색 검은색
	private final static Color gridColor = Color.GRAY;//격자선색 회색
	private int leftRightMargin;
	private int topBottomMargin;
	private World world;
	 
	public GamePanel() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getY()<topBottomMargin||e.getX()<leftRightMargin) {
					return;//벗어난값이기때문에 리턴
				}
				int row=(e.getY()-topBottomMargin)/CELLSIZE;
				int col=(e.getX()-leftRightMargin)/CELLSIZE;
				if(row>=world.getRows()||col>=world.getColumns()) {
					return;
				}
				boolean status=world.getCell(row, col);
				world.setCell(row, col, !status);
				
				
				repaint();//새로고침
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2=(Graphics2D)g;//2D그래픽을 사용하기 위해
		int width = getWidth();//가로길이
		int height = getHeight();//세로길이
		
		leftRightMargin=((width%CELLSIZE)+CELLSIZE)/2;
		topBottomMargin=((height%CELLSIZE)+CELLSIZE)/2;
		
		int rows=(height-2*topBottomMargin)/CELLSIZE;
		int cols=(width-2*leftRightMargin)/CELLSIZE;
		if(world==null) {
			world=new World(rows,cols);
		}else {
			if(world.getRows()!=rows||world.getColumns()!=cols) {
				world= new World(rows,cols);
			}
		}
		
		//grid이중배열에 좌표값을 true로 set
		
		g2.setColor(backgroundColor);//색설정
		g2.fillRect(0,0,width,height);//사각형의 좌표에 색을 칠함
		
		drawGrid(g2,width,height);//줄을 긋는 메소드
		for(int col=0;col<cols;col++) {
			for(int row=0;row<rows; row++) {
				boolean status = world.getCell(row, col);
				fillCell(g2,row,col,status);
			}
		}
		
	}
	private void fillCell(Graphics g2,int row,int col,boolean status) {
		//사각형에 색을 넣는 메소드(그래픽,가로,세로,상태(true녹색,false배경색)
		Color color = status ? Color.GREEN:backgroundColor;
		g2.setColor(color);
		int x= leftRightMargin+(col*CELLSIZE);
		int y= topBottomMargin+(row*CELLSIZE);
		g2.fillRect(x+1,y+1,CELLSIZE-1,CELLSIZE-1);
		
	}
	private void drawGrid(Graphics2D g2,int width, int height) {
		g2.setColor(gridColor);
		for(int x=leftRightMargin;x<=width-leftRightMargin;x+=CELLSIZE) {
			//줄을 긋는 메소드 (x,y) (x2,y2)
			g2.drawLine(x,topBottomMargin,x,height-topBottomMargin);
		}
		for(int y=topBottomMargin;y<=width-topBottomMargin;y+=CELLSIZE) {
			//줄을 긋는 메소드 (x,y) (x2,y2)
			g2.drawLine(leftRightMargin,y,width-leftRightMargin,y);
		}
	}
	public void randomize() {
		//엔터키를 눌렀을때=>랜덤으로 그리드 생성
		world.randomize();
		repaint();
	}
	public void clear() {
		world.clear();
		repaint();
		
	}
	public void next() {
		world.next();
		repaint();
		
	}
}
