package warehouse;

/**
 * Defines functionalities for putting an order for an item.
 */
public class Order {

  /**
   * default quantity to be used for orders.
   */
  private static final int DEFAULT_QUANTITY = 10;

  /**
   * puts an order with a given quanity for all items.
   *
   * @param quantity defines the ordered quantity.
   */
  public void putOrder(final int quantity) {
    System.out.println("Order is created for " + quantity);
  }

  /**
   * starting point of the program.
   *
   * @param args inputs entered by the system at the start point.
   */
  public static void main(final String[] args) {
    Order order = new Order();
    order.putOrder(DEFAULT_QUANTITY);

  }

}
