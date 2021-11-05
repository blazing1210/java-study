package chocoBank;

import java.util.Scanner;

public class Bankrun {
	Account account=new Account();
	Scanner scan=new Scanner(System.in);
	String userId="";
	String userPassword="";
	int userIndex=0;
	
	void mainScreen(){
		System.out.println("초코뱅크 메인화면입니다. 로그인하시려면 1번을 계정을 만드시려면 2번을 눌러주세요.");
		int chose=scan.nextInt();
		switch (chose) {
		case 1:
			loginScreen();
			break;
		case 2:
			createAccount();
			break;
		default:
			System.out.println("잘못누르셨습니다");
			mainScreen();
			break;
		}

		
		
	}
	private void loginScreen() {
		
		System.out.println("아이디를 입력해주세요.");
		userId=scan.nextLine();
		int count=1;
		for(int i=0;i>account.getList().size();i++) {
		if(account.getList().get(i).getId()==userId) {
			count=1;
			System.out.println("비밀번호를 입력해주세요");
			userPassword=scan.nextLine();
			
			if(account.getList().get(i).getPassword()==userPassword) {
				userIndex=i;
				bankMenu();
				break;
				}else if(account.getList().size()==count){
					System.out.println("없는 패스워드 입니다.");
					mainScreen();
					break;
				}else count+=1;
			
			}else if(account.getList().size()==count){
				System.out.println("없는 아이디 입니다.");
				mainScreen();
				
			}else count+=1;
		}
	}
	
	private void createAccount() {
		System.out.println("아이디를 입력해주세요");
		userId=scan.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		userPassword=scan.nextLine();
		account.adduser(userId, userPassword);
		bankMenu();
	}
	private void bankMenu() {
		System.out.printf("안녕하십니까 %s님 어떤 메뉴를 선택 하시겠습니까?\n 1.계좌잔액조회 2.입금하기 3.출금하기 4.계좌이체  5.오늘의 운세 6.종료하기",userId);
		int menuSelector=scan.nextInt();
		switch(menuSelector) {
		case 1:
			System.out.printf("%s님의 계좌에는 현재 %d원이 있습니다",account.getList().get(userIndex).getId(),account.getList().get(userIndex).getMoney());
			shutDown();
			break;
		case 2:
			System.out.println("얼마를 입금 하시겠습니까?");
			int inMoney=scan.nextInt();
			account.getList().get(userIndex).setMoney(account.getList().get(userIndex).getMoney()+inMoney);
			System.out.printf("입금한 금액은 %d원 현재잔액은 %d원 입니다.",inMoney,account.getList().get(userIndex).getMoney());
			shutDown();
			break;
		case 3:
			System.out.println("얼마를 출금 하시겠습니까?");
			int outMoney=scan.nextInt();
			account.getList().get(userIndex).setMoney(account.getList().get(userIndex).getMoney()-outMoney);
			shutDown();
			break;
		case 4:
			System.out.println("누구에게 보내시겠습니까? 번호를 입력해주십시요");
			account.visibleUser(account.getList().get(userIndex));
			int choseUser=scan.nextInt();
			
			break;

		case 5:
			
			break;
		case 6:
			
			break;
		default:
			
			break;
		}
	}
	private void shutDown(){
		System.out.println("\n 메뉴로 돌아가기 y  종료하기 n ");
		String choose=scan.nextLine();
		switch(choose.toLowerCase()) {
		case "y":
			bankMenu();
			
			break;
		case "n":
			closement();
			break;
	}
}
	private void closement() {
		System.out.println("초코뱅크를 사용해주셔서 감사합니다.\n 평안한 하루되십시오.");
		
	}
}