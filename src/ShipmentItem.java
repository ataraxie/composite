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

	protected String getIndentString(int indent) {
		String baseString = indent == 0 ? "" : "\n";
		StringBuilder builder = new StringBuilder(baseString);
		for (int i = 0; i < indent; i++) {
			builder.append("-");
		}
		return builder.toString();
	}

}
