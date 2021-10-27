package model;

import java.util.Random;

//셀의 상태를 저장하는 객체 
public class World {
	private int rows;//줄
	private int columns;//열
	
	private boolean[][] grid;//불린 이중배열
	private boolean[][] buffer;//버퍼임시배열
	
	public World(int rows,int columns) {//월드 생성자 (가로,세로)
		this.rows=rows;
		this.columns=columns;
		
		grid = new boolean[rows][columns];//이중배열 객체 만들기(크기설정)
		buffer = new boolean[rows][columns];//임시 배열
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
	public void randomize() {
		//그리드 배열에 랜덤으로 true false넣기
		Random random =new Random();
		for (int i=0;i<(rows*columns)/10;i++) {
			int row=random.nextInt(rows);//랜덤으로 rows(전체줄수)-1까지 랜덤 생성
			int col=random.nextInt(columns);//랜덤으로 columns(전체줄수)-1까지 랜덤 생성
			setCell(row,col,true);
		}
	}
	public void clear() {//모든 grid의 셀을 false로  만든다
		for(int row=0;row<rows;row++) {
			for(int col=0;col<columns; col++) {
				setCell(row,col,false);
			}
		}
	}
	public void next() {
		//스페이스바를 누르면 모든 셀의 좌표를 출력한다.
		for(int row=0;row<rows;row++) {
			for(int col=0;col<columns; col++) {
				int neighbours=countNeighbours(row,col);
				System.out.printf("(%d,%d) %d \n",row,col,neighbours);
				/*알고리즘
				 * 1.주변 녹색개수<2 or>3는 검은색
				 * 2.녹색개수==3일때 녹색
				 * 3.녹색개수==2일때 그대로
				 * */
				boolean status = false;
				if(neighbours<2) {
					status=false;
				}else  if(neighbours>3) {
					status=false;
				}else if (neighbours==3) {
					status=true;
				}else if (neighbours==2) {
					status=getCell(row,col);//상태는 그대로 현재 셀의 상태
				}
				buffer[row][col]=status;
				
			}
		}
		for(int row=0;row<rows;row++) {
			for(int col=0;col<columns; col++) {
				grid[row][col]=buffer[row][col];
			}
		}
	}
	private int countNeighbours(int row, int col) {
		int n=0;
		for(int rowOffset=-1;rowOffset<=1;rowOffset++) {
			for(int colOffset=-1;colOffset<=1;colOffset++) {
				
				if(rowOffset==0 && colOffset==0) {continue;}
				
				int gridRow=row+rowOffset;
				int gridCol=col+colOffset;
				
				if(gridRow<0) {
					continue;
				}else if(gridRow==rows) {
					continue;
				}
				if(gridCol<0) {
					continue;
				}else if(gridCol==columns) {
					continue;
				}
				
				
				boolean status=getCell(gridRow,gridCol);
				
				if(status) {n++;}
			}
		}
		return n;
	}
}
