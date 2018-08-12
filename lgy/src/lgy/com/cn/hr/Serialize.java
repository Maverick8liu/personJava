package lgy.com.cn.hr;

public class Serialize {
	public static void main(String[] args){
		Salary salary = new Salary(1000,2500);
		
		Person person = new Person("张三",salary);
		
		//持久化
		SerializationUtils.writeObject(person);
		
	}
}
