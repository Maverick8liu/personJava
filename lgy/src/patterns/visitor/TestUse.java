package patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class TestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor appOwner  = new APPOwner();
		ArrayList<User> users = new ArrayList<User>();
		users.add(new UserOrdinary("��ͨ�û��̷���"));
		users.add(new UserOrdinary("����һ����ͨ�û��ıȽϳ��ķ���"));
		users.add(new UserVIP("VIP�û��Ķ̷���"));
		users.add(new UserVIP("VIP�û��ıȽϳ��ķ�������"));
		
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()){
			iterator.next().accept(appOwner);
		}
		
	}

}
