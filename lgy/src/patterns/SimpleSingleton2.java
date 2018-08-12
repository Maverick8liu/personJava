package patterns;

import java.awt.image.SinglePixelPackedSampleModel;

public class SimpleSingleton2 {
	private static SimpleSingleton2 instance = new SimpleSingleton2();
	
	private SimpleSingleton2(){}
	
	public static SimpleSingleton2 getInstance(){
		return instance;
	}
	
	
}
