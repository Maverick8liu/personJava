package patterns.strategy;
/**
 * 
 * @author Administrator
 *����һϵ���㷨��������һ������װ����������ʹ���ǿ��໥�滻����ģʽʹ���㷨�ɶ����������ͻ��˶��仯��

    ��ʱʹ��

    �ŵ�

    ����ģʽ�Ƕ��㷨�İ�װ���ǰ�ʹ���㷨�����κ��㷨�����ָ����ί�ɸ���ͬ�Ķ������������ģʽͨ����һ��ϵ�е��㷨��װ��һϵ�еĲ��������棬��Ϊһ���������������ࡣ��һ�仰��˵�����ǣ���׼��һ���㷨������ÿһ���㷨��װ������ʹ�����ǿ��Ի��������������һ��ʾ���Ե�ʵ�ֽ������ģʽʵ���Ľṹ��

   ����ģʽ�а������ֽ�ɫ��

    ���ԣ�Strategy����һ���ӿڣ����������ɸ��㷨�����󷽷�����
    ������ԣ�ConcreteStrategy�������Ե�ʵ�֡�
    ������/������Context���������ڲ��Խӿڵ��ࡣ
    ����ģʽ�����Ĳ������ʵ���㷨�����������֯��������Щ�㷨���Ӷ��ó���ṹ�������и��õ�ά���Ժ���չ�ԡ�

    ����ģʽһ���ܴ���ص���Ǹ��������㷨��ƽ���ԡ�����һϵ�о���Ĳ����㷨����ҵĵ�λ����ȫһ���ģ�����Ϊ���ƽ���ԣ�����ʵ���㷨֮������໥�滻�����еĲ����㷨��ʵ����Ҳ���໥�����ģ��໥֮����û�������ġ����Կ�������������һϵ�в����㷨�������㷨����ͬ��Ϊ�Ĳ�ͬʵ�֡�

    �����ڼ䣬����ģʽ��ÿһ��ʱ��ֻ��ʹ��һ������Ĳ���ʵ�ֶ�����Ȼ���Զ�̬���ڲ�ͬ�Ĳ���ʵ�����л�������ͬʱֻ��ʹ��һ����

    �����������ǣ����еľ�������඼��һЩ���е���Ϊ����ʱ�򣬾�Ӧ������Щ���е���Ϊ�ŵ���ͬ�ĳ�����Խ�ɫStrategy�����档��Ȼ��ʱ�������Խ�ɫ����Ҫ��Java������ʵ�֣�������ʹ�ýӿڡ� ����ʵҲ�ǵ��͵Ľ�������̳еȼ��ṹ���Ϸ����еı�׼������

    �ϴ�����ʹ��״̬ģʽ�����ݰ���ͬ״̬���浽��ͬ�ط����������ʹ�ò���ģʽ��ʵ��ͨ����ͬ�Ĳ�����ѡ�����ݵı��淽ʽ��

    �����ǳ�������ݱ����ࣨ���ԣ���
 */
public interface ISaveData {
	void save(Object data);
}