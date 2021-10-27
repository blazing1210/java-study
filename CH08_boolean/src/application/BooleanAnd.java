package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// == <>(같다),!=(같지않다),!(반대),&&(그리고),||(또는)
		boolean isRaining=false;//비가 오는가?
		boolean haveUmbrella=true;
		boolean takeUmbrella=false;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella=true;
			}
		}
		System.out.println("첫번째 경우 : "+takeUmbrella);
		//And 연산자 &&
		if(isRaining&&haveUmbrella) {
			takeUmbrella=true;
		}
		System.out.println("AND 사용시 : "+takeUmbrella);
		
		takeUmbrella=isRaining&&haveUmbrella;
		System.out.println("삼항조건 사용 : "+takeUmbrella);
	}
}
