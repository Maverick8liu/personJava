package patterns.composite;

import java.util.Iterator;
import java.util.List;
/**
 * ���ģʽ
 * @author Administrator
 * ��������ϳ����νṹ�Ա�ʾ������-���塱�Ĳ�νṹ��Compositeʹ�û��Ե����������϶����ʹ�þ���һ���ԡ�

    ��ʱʹ�ã�

    �����ʾ����Ĳ���-�����νṹ��
    ϣ���û���һ�µķ�ʽ�������������϶���
    �ŵ㣺

    ���ģʽ�а�������������϶��󣬲��γ����νṹ��ʹ�û����Է���ش������������϶���
    ��϶���͸������ʵ������ͬ�Ľӿڣ��û�һ���������ָ���������϶���
    �������µ�Composite�ڵ��Leaf�ڵ�ʱ���û�����Ҫ���벻��Ҫ�����޸ġ�
    ���ģʽ��ʱ���ֽ�������-����ģʽ����ʹ�������ͽṹ�������У�ģ���˼�Ԫ�غ͸���Ԫ�صĸ��� ���ͻ�������������Ԫ��һ����������Ԫ��,�Ӷ�ʹ�ÿͻ������븴��Ԫ�ص��ڲ��ṹ������ģʽ��������Ż������ ���ּ����ݽṹ���������ڷּ����ݽṹ�����ӣ�ʹ�����ģʽ�ǳ�������֮�ء����ڷּ����ݽṹ��һ���ձ��Ե������ǵ��Ե��ļ�ϵͳ���������Ǿ�������������������ģʽ����Ȼ����ֱ��ʹ��Tree�������ݽṹҲ��ֱ����������

    һ���ļ�ϵͳ�У���Ŀ¼��Ŀ¼�����ļ���Ŀ¼

    Ŀ¼���ļ��ĳ���ӿڣ������������
 */
//�������
public interface Component {
	void addFile(Component file);

	Component addFolder(Component folder);

	void removeFile(Component file);

	void removeFolder(Component folder);

	List<Component> getFiles();

	List<Component> getFolders();

	List<Component> getAll();

	Iterator<Component> iterator();

	void display();
}