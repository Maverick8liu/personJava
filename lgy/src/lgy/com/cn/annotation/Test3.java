package lgy.com.cn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import lgy.com.cn.annotation.Desc.Color;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird brid = BirdNest.Sparrow.reproduce();	
		
		Color color = brid.getColor();
		
		System.out.println("Bird¡®s color is:"+color);

	}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@interface Desc{
	enum Color {
			White,Grayish,Yellow;
	}
	Color c() default Color.White;
}


@Desc(c = Color.White)
abstract class Bird{
	
	public abstract Color getColor();
}

class Sparrow extends Bird{
	
	private Color color;
	
	public Sparrow(){
		color = Color.Grayish;
	}
	
	public Sparrow(Color _color){
		color = _color;
	}
	
	
	public Color getColor(){
		return color;
	}
}

enum BirdNest{
	Sparrow;
	public Bird reproduce(){
		Desc bd = Sparrow.class.getAnnotation(Desc.class);
		
		return bd == null?new Sparrow():new Sparrow(bd.c());
	} 
}
