package lgy.com.cn.hr;

public class Serialize {
	public static void main(String[] args){
		Salary salary = new Salary(1000,2500);
		
		Person person = new Person("����",salary);
		
		//�־û�
		SerializationUtils.writeObject(person);
		
	}
}
