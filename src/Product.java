

public class Product extends ShipmentItem {

	private Double price;

	public Product(String name, Double price) {
		super(name);
		this.price = price;
	}

	@Override
	public String getContentAsString(int indent) {
		// TODO: implement :)
		return null;
	}

	@Override
	public double getTotalPrice() {
		// TODO: implement :)
		return -1.0;
	}

}
