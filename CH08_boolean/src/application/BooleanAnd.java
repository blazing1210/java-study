package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// == <>(����),!=(�����ʴ�),!(�ݴ�),&&(�׸���),||(�Ǵ�)
		boolean isRaining=false;//�� ���°�?
		boolean haveUmbrella=true;
		boolean takeUmbrella=false;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella=true;
			}
		}
		System.out.println("ù��° ��� : "+takeUmbrella);
		//And ������ &&
		if(isRaining&&haveUmbrella) {
			takeUmbrella=true;
		}
		System.out.println("AND ���� : "+takeUmbrella);
		
		takeUmbrella=isRaining&&haveUmbrella;
		System.out.println("�������� ��� : "+takeUmbrella);
	}
}