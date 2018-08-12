package lgy.com.cn;

public class Client1 {

	
	public void methodA(String sr,Integer... is){
		
	}
	
	public void methodA(String str,String... strs){
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client1 client = new Client1();
		client.methodA("china", 0);
		client.methodA("China", "people");
		//client.methodA("china");
		//client.methodA("china", null);
		String[] strs = null;
		client.methodA("china", strs);
	}

}
