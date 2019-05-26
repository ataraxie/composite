public abstract class ShipmentItem {

	protected String name;

	public String getContentAsString(int indent) {
		String baseString = indent == 0 ? "" : "\n";
		StringBuilder builder = new StringBuilder(baseString);
		for (int i = 0; i < indent; i++) {
			builder.append("-");
		}
		return builder.toString();
	}

	public abstract double getTotalPrice();

	public ShipmentItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
