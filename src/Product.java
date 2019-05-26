

public class Product extends ShipmentItem {

	private Double price;

	public Product(String name, Double price) {
		super(name);
		this.price = price;
	}

	@Override
	public String getContentAsString(int indent) {
		return super.getContentAsString(indent) + this.name;
	}

	@Override
	public double getTotalPrice() {
		return this.price;
	}

}
