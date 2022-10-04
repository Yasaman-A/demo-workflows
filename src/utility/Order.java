package utility;

public class Order {
	
	
	public void putOrder (int q) {
		System.out.println("Order created for : " + q);
	}
	
	public static void main(String[] args) {
		Order o = new Order();
		o.putOrder(10);
	}

}
