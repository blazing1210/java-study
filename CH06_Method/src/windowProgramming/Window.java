package windowProgramming;

public class Window {
	//클래스 변수
	private int width;
	private int height;
	private boolean invisible;
	private int top;
	private int left;
	
	public void setwidth(int width){
			this.width=width;
	}
	public int getwidth() {
		return width;
	}
	public void setheight(int height){
		this.height=height;
	}
	public int getheight() {
		return height;
	}
	public void setinvisible(boolean invisible) {
		this.invisible=invisible;
	}
	public boolean getinvisible() {
		return invisible;
	} 
	public void settop(int top){
		this.top=top;
	}
	public int gettop() {
		return top;
	}
	public void setleft(int left){
		this.left=left;
	}
	public int getleft() {
		return left;
	}
}
