package chocoBank;

import java.util.ArrayList;
//유저계정리스트
public class Account {
	private ArrayList<UserInfo> list=new ArrayList<>();
	
	
	public  void adduser(String id,String password){
		list.add(new UserInfo(id,password));
	}

	public ArrayList<UserInfo> getList() {
		return list;
	}

	public void setList(ArrayList<UserInfo> list) {
		this.list = list;
	}
	public void visibleUser(UserInfo id) {
		
		for(int i=0;i>list.size();i++) {
			if(id.getId()!=list.get(i).getId()){
			System.out.printf("%s,%d번",list.get(i),i);
		}else
		{continue;}
			
		}
	}
	}
	//유저 객체
	class UserInfo{
		private String id;
	    private String password;
	    private int money=0;
	    
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		
		UserInfo(String id,String password){
			this.id=id;
			this.password=password;
			
		}
		
	}
	
	

