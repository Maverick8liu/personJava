package patterns;

/**
 * java 中的单例模式中的其中的饱汉模式
 * 
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *  单例模式的类唯一实例由其本身控制，可以很好的控制用户何时访问它。
    单例模式概念很简单，而且也比较常用。

    在使用这个模式的时候，我们要考虑是否会在多线程中使用，如果不会应用于多线程，那写法就足够简单：
 * @author liuguoyu
 *
 */
public class SimpleSingleton {
	private static SimpleSingleton instance;
	
	private SimpleSingleton(){}
	
	
	public static SimpleSingleton getIntance(){
		if(instance == null)
			instance = new SimpleSingleton();
		
		return instance;
	}
}
