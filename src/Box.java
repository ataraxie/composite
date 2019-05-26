import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box extends ShipmentItem {

	private List<ShipmentItem> items = new ArrayList<>();

	public Box(String name, ShipmentItem... childProducts) {
		super(name);
		items.addAll(Arrays.asList(childProducts));
	}

	@Override
	public String getContentAsString(int indent) {
		String base = super.getIndentString(indent);
		StringBuilder builder = new StringBuilder(base + this.name);
		for (ShipmentItem item : items) {
			builder.append(item.getContentAsString(indent + 2));
		}
		return builder.toString();
	}

	@Override
	public double getTotalPrice() {
		double totalPrice = 0;
		for (ShipmentItem item : this.items) {
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
}
