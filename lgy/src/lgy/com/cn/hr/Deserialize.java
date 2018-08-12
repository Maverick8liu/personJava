package lgy.com.cn.hr;

public class Deserialize {
	public static void main(String[] args){
		//Salary salary = new Salary(1000,2500);
		Person p = (Person) SerializationUtils.readObject();
				//new Person("张三",salary);
		StringBuffer sb = new StringBuffer();
		sb.append("姓名："+p.getName());
		sb.append("\t基本工资:"+p.getSalary().getBasePay());
		sb.append("\t绩效工资："+p.getSalary().getBonus());
		System.out.println(sb);
		
	}
}
