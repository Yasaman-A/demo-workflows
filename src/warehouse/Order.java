package warehouse;

public class Order {

	private static int defaulQuantity = 10;
	
	public void putOrder(int quantity) {
		System.out.println("Order is created for " + quantity);
	}
	
	public static void main(String[] args) {
		Order order = new Order();
		
		order.putOrder(defaulQuantity);

	}

}
