package example;

public class Split_String {

	public static void main(String[] args) {
		//문자열.split(" ")=>문자열을 공백으로 쪼개서 배열로 리턴
		String text1="When Joe Manchin stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2="해외 연예뉴스까지 섭렵하는 사람이면, 올해 일본에서 탄생한 부부, 커플들 소식에 놀랐을 것이다. 그중 일본 연예계에서 패셔너블, 스타일리시를 담당하는 두 배우 스다 마사키와 고마츠 나나의 연애 소식 또한 올해의 소식 중 하나였다. 공개적으로 밝힌 사이는 아니지만 현지에선 올해 결혼 예정이란 루머까지 있을 정도로 확실시되고 있는 두 사람. 그런 두 사람이 주연을 맡은 영화 <실: 인연의 시작>이 10월 14일 국내 개봉했다. 이 영화와 함께 두 사람이 함께 출연했던 영화 두 편을 같이 만나보자.";
		String[] words=text1.split("[^a-zA-Z]+");//정규표현식 []
		String[] words2=text2.split("[^가-힣]");
		for(String w:words) {
			if(w.length()<=2) {
				continue;
			}
			System.out.println(w);
		}
		for(String w:words2) {
			if(w.length()<=2) {
				continue;
			}
			System.out.println(w);
		}
		
	}

}
