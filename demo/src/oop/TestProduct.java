package oop;

class Product {
	// Instance variables
	private String name;
	private double price;
	private int qoh;

	// Static or class variable
	private static double taxRate = 0.10;

	// constructor
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void puchase(int qty) {
		this.qoh += qty;
	}

	public void sell(int qty) {
		this.qoh -= qty;
	}

	public double getNetPrice() {
		return this.price + this.price * Product.taxRate;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQoh() {
		return this.qoh;
	}

	public static double getTaxRate() {
		return Product.taxRate;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		
		System.out.println(Product.getTaxRate());
		
		Product p = new Product("iPhone 17 Pro", 110000);

		p.puchase(10);
		p.sell(2);

		System.out.println(p.getNetPrice());

		// Product p2 = new Product();

	}

}
