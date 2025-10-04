package oop;

class Product  {
	 private String name;
	 private double price;
	 private int qoh;
	 
	 // constructor 
	 public Product(String n, double p) {
		 name = n;
		 price = p;
	 }
	 
	 public void puchase(int qty) {
		 qoh += qty;
	 }
	 
	 public void sell(int qty) {
		 qoh -= qty;
	 }
	 
	 public double getNetPrice() {
		 return price + price * 0.08; 
	 }
	 
	 public void setPrice(double p) {
		 price = p;
	 }
	 
	 public int getQoh() {
		 return qoh;
	 }
}

public class TestProduct {

	public static void main(String[] args) {
		Product p = new Product("iPhone 17 Pro", 110000);
		
		p.puchase(10);
		p.sell(2);
		
		System.out.println(p.getNetPrice());
		
		//Product p2 = new Product();
		
	}

}
