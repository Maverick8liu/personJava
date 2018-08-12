package patterns.facade;

//º∆À„”≈ª›
public class Discount {
	int getDiscount(String discountCode) {
		return Math.abs(discountCode.hashCode()) % 3;
	}
}