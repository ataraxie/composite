public abstract class ShipmentItem {

	protected String name;

	public abstract String getContentAsString(int indent);
	public abstract double getTotalPrice();

	public ShipmentItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
