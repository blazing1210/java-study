package model;
//셀의 상태를 저장하는 객체 
public class World {
	private int rows;//줄
	private int columns;//열
	
	private boolean[][] grid;
	
	public World(int rows,int columns) {//월드 생성자 (가로,세로)
		this.rows=rows;
		this.columns=columns;
		
		grid = new boolean[rows][columns];//이중배열 객체 만들기(크기설정)
		
	}
	public boolean getCell(int row,int col) {
		return grid[row][col];//월드의grid에서 셀이 녹색인지 검은색인지?
	}
	public void setCell(int row, int col,boolean status) {
		grid[row][col]=status;//셀의 상태를 설정
	}
	public int getRows() {
		return rows;//만들어진 배열의 줄수를 리턴
	}
	public int getColumns() {
		return columns;//만들어진 배열의 열수를 리턴
	}
}
