package chocoBank;

import java.util.ArrayList;
//유저계정리스트
public class Account {
	private ArrayList<UserInfo> list=new ArrayList<>();

	public  void adduser(String id,String password,int money){
		list.add(new UserInfo(id,password,money));
	}
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
		
		for(int i=0;i<list.size();i++) {
			if(id.getId().equals(list.get(i).getId())){
			continue;
		}else System.out.printf("%s, %d번유저 \n",list.get(i).getId(),i);
		
			
		}
	}
	}
	
	
	

