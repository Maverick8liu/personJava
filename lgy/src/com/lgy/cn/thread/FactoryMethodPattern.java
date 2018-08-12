package com.lgy.cn.thread;

public class FactoryMethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = CarFactory.createCar(FordCar.class);
		Car car1 = CarFactory1.BuickCar.create();
	}


}

interface Car{
	
};

class FordCar implements Car{
	
}

class BuickCar implements Car{
	
}

class CarFactory{
	public static Car createCar(Class<? extends Car> c){
		try {
			return c.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
		
	}
}

enum CarFactory1{
	FordCar,BuickCar;
	
	public Car create(){
		switch(this){
			case FordCar:
				return new FordCar();
		case BuickCar:
				return new BuickCar();
		default:
				throw new AssertionError("invalid parameter");
		}
	}
}

enum CarFacotry2{
	FordCar{
		public Car create(){
			return new FordCar();
		}
	},
	BuickCar{
		public Car create(){
			return new BuickCar();
		}
	};
	
	public abstract Car create();
}

