package chocoBank;

import java.util.Scanner;
public class Bankrun {
	Account account=new Account();
	Scanner scan=new Scanner(System.in);
	String userId="";
	String userPassword="";
	int userIndex=0;
	Todays_fortune fortune=new Todays_fortune();
	Bankrun(Account account){
		this.account=account;
	}
	void  mainScreen(){
		System.out.println("\n------------------------\n\n초코뱅크 메인화면입니다.\n\n------------------------\n 로그인하시려면 1번을 계정을 만드시려면 2번을 눌러주세요.");
			String choseMain = "";
			Scanner scan=new Scanner(System.in);
				choseMain=scan.next();
			
			
			
			switch (choseMain) {
			case "1":
				loginScreen();
				break;
			case "2":
				createAccount();
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				mainScreen();
				break;
				
			}
		}	
		

	private void loginScreen() {
		boolean idCheck=false;
		boolean pwdCheck=false;
		System.out.println("아이디를 입력해주세요.");
		Scanner scan=new Scanner(System.in);
		userId=scan.next();
		for(int i=0;i<account.getList().size();i++) {
			if(userId.equals(account.getList().get(i).getId())) {
				idCheck=true;
				break;
				}	
			userIndex+=1;
		}
		if(idCheck) {
			System.out.println("비밀번호를 입력해주세요.");
			userPassword=scan.next();
			for(int i=0;i<account.getList().size();i++) {
				if(userPassword.equals(account.getList().get(i).getPassword())) {
					pwdCheck=true;
					bankMenu();
					break;
					}
			}
			if(pwdCheck==false) {
			System.out.println("비밀번호가 틀렸습니다. 처음부터다시 입력해주십시요.\n");
			mainScreen();
			}
			
			
		}
		if(idCheck==false) {
		System.out.println("존재하지 않는 아이디입니다.\n");
		mainScreen();
		}
		
		
	}	
	private void createAccount() {
		userIndex=account.getList().size();
		System.out.println("아이디를 입력해주세요");
		userId=scan.next();
		System.out.println("비밀번호를 입력해주세요");
		userPassword=scan.next();
		account.adduser(userId, userPassword);
		bankMenu();
	}
	private void bankMenu() {
		
		System.out.printf("안녕하십니까 %s님 어떤 메뉴를 선택 하시겠습니까?\n 1.계좌잔액조회 2.입금하기 3.출금하기 4.계좌이체 5.오늘의 운세 6.내정보확인 7.종료하기\n",userId);
		Scanner input=new Scanner(System.in);
		String menuSelector=input.next();
		switch(menuSelector) {
		case "1":
			System.out.printf("%s님의 계좌에는 현재 %d원이 있습니다",account.getList().get(userIndex).getId(),account.getList().get(userIndex).getMoney());
			shutDown();
			break;
		case "2":
			System.out.println("얼마를 입금 하시겠습니까?");
			int inMoney=0;
			try {
				Scanner scan=new Scanner(System.in);
				inMoney=scan.nextInt();
			}catch(Exception e){
				System.out.println("정수를 입력해주세요.");
				Scanner scan=new Scanner(System.in);
				inMoney=scan.nextInt();
			}
			account.getList().get(userIndex).setMoney(account.getList().get(userIndex).getMoney()+inMoney);
			System.out.printf("입금한 금액은 %d원 현재잔액은 %d원 입니다.",inMoney,account.getList().get(userIndex).getMoney());
			shutDown();
			break;
		case "3":
			System.out.println("얼마를 출금 하시겠습니까?");
			int outMoney=0;
			try {
				Scanner scan=new Scanner(System.in);
				outMoney=scan.nextInt();
			}catch(Exception e){
				System.out.println("정수를 입력해주세요.");
				Scanner scan=new Scanner(System.in);
				outMoney=scan.nextInt();
		}
			if (account.getList().get(userIndex).getMoney()<=0) {
				System.out.println("잔액이 부족합니다 다시 입력해주십시요.");
				bankMenu();		
			}
			account.getList().get(userIndex).setMoney(account.getList().get(userIndex).getMoney()-outMoney);
			System.out.printf("출금한 금액은 %d원 현재잔액은 %d원 입니다.",outMoney,account.getList().get(userIndex).getMoney());
			shutDown();
			break;
			
		case "4":
			System.out.println("누구에게 보내시겠습니까? 번호를 입력해주십시요");
			account.visibleUser(account.getList().get(userIndex));
			int choseUser=0;
			try {
				Scanner scan=new Scanner(System.in);
				choseUser=scan.nextInt();
			}catch(Exception e){
				System.out.println("정수를 입력해주세요.");
				Scanner scan=new Scanner(System.in);
				choseUser=scan.nextInt();
			}
			System.out.println("이체할 금액을 입력해주십시요.");
			int sendMoney=0;
			try {
				Scanner scan=new Scanner(System.in);
				sendMoney=scan.nextInt();
				}catch(Exception e){
					System.out.println("정수를 입력해주세요.");
					Scanner scan=new Scanner(System.in);
					sendMoney=scan.nextInt();
				}
			if (account.getList().get(userIndex).getMoney()<sendMoney) {
				System.out.println("잔액이 부족합니다 다시 입력해주십시요.\n");
				bankMenu();		
			}
			account.getList().get(userIndex).setMoney(account.getList().get(userIndex).getMoney()-sendMoney);
			account.getList().get(choseUser).setMoney(account.getList().get(choseUser).getMoney()+sendMoney);
			System.out.printf("%s님에게 %d원이 입금되었습니다.",account.getList().get(choseUser).getId(),sendMoney);
			shutDown();
			break;

		case "5":
			fortune.run();
			shutDown();
			break;
		case "6":
			Boolean pwdCheck=false;
			System.out.println("비밀번호를 다시 입력해주십시요.");
			String reuserPwd=scan.next();	
			for(int i=0;i<account.getList().size();i++) {
				if(i==userIndex&&reuserPwd.equals(account.getList().get(i).getPassword())) {
					System.out.printf("\n아이디 : %s\n비밀번호 : %s\n보유금액 : %d\n\n",account.getList().get(i).getId(),account.getList().get(i).getPassword(),account.getList().get(i).getMoney());
					pwdCheck=true;
					bankMenu();
					break;
					}
				
			}
			pwdCheck=false;
			if(pwdCheck) System.out.println("비밀번호가 잘못되었습니다.");
			
			shutDown();
			break;
			
		case "7":
			closement();
			break;
		default:
			Scanner scan=new Scanner(System.in);
			System.out.println("잘못 누르셨습니다.");
			shutDown();
			break;
		}
	}
	private void shutDown(){
		System.out.println("\n\n\n  -------------------------------\n   메뉴로 돌아가기 y  종료하기 n \n  -------------------------------\n ");
		Scanner scan=new Scanner(System.in);
		String choose=scan.next();
		switch(choose.toLowerCase()) {
		case "y":
			bankMenu();
			
			break;
		case "n":
			closement();
			break;
		default:
			System.out.println("잘못누르셨습니다.");
			shutDown();
			break;
		
		}
	}
	
	private void closement() {
		System.out.println("초코뱅크를 사용해주셔서 감사합니다.\n평안한 하루되십시오.\n\n");
			userIndex=0;
		
			mainScreen();	
			
	}

} 

	