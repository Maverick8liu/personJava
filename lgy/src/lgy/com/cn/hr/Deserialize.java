package lgy.com.cn.hr;

public class Deserialize {
	public static void main(String[] args){
		//Salary salary = new Salary(1000,2500);
		Person p = (Person) SerializationUtils.readObject();
				//new Person("����",salary);
		StringBuffer sb = new StringBuffer();
		sb.append("������"+p.getName());
		sb.append("\t��������:"+p.getSalary().getBasePay());
		sb.append("\t��Ч���ʣ�"+p.getSalary().getBonus());
		System.out.println(sb);
		
	}
}
