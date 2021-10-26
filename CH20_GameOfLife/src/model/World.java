package model;
//���� ���¸� �����ϴ� ��ü 
public class World {
	private int rows;//��
	private int columns;//��
	
	private boolean[][] grid;
	
	public World(int rows,int columns) {//���� ������ (����,����)
		this.rows=rows;
		this.columns=columns;
		
		grid = new boolean[rows][columns];//���߹迭 ��ü �����(ũ�⼳��)
		
	}
	public boolean getCell(int row,int col) {
		return grid[row][col];//������grid���� ���� ������� ����������?
	}
	public void setCell(int row, int col,boolean status) {
		grid[row][col]=status;//���� ���¸� ����
	}
	public int getRows() {
		return rows;//������� �迭�� �ټ��� ����
	}
	public int getColumns() {
		return columns;//������� �迭�� ������ ����
	}
}
