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
		// TODO: implement :)
		return null;
	}

	@Override
	public double getTotalPrice() {
		// TODO: implement :)
		return -1.0;
	}
}
