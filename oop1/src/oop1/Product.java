package oop1;

//PascalCase:classların ilk harfi büyük olur
public class Product {
	private String name;
	// camelCase
	private double unitPrice;
	private double discount;
	private String imageUr1;
	private int unitsInStock;

	// private bu classa özel demek
	//get okumak set yazmak için
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUr1() {
		return imageUr1;
	}

	public void setImageUr1(String imageUr1) {
		this.imageUr1 = imageUr1;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
