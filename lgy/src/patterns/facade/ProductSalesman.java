package patterns.facade;

//���
public enum ProductSalesman {
	instance;
	Stock stock = new Stock();
	FinalPrice finalPrice = new FinalPrice();

	Object buySomething(String product, String addr, String discountCode) {
		if (!stock.hasStock(product))
			return "��治��";
		int price = finalPrice.getFinalPrice(product, addr, discountCode);
		return "������Ϣ:" + product + "-" + addr + "-" + discountCode + "-" + price;
	}
}