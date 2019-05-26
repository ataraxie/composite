import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipmentItemTest {

	private static Box TEST_ORDER_BOX;

	@BeforeAll
	static void setup() {
		Product receipt = new Product("Receipt", 0.0);
		Product hammer = new Product("Hammer", 20.00);
		Product phone = new Product("Phone", 500.00);
		Product headphones = new Product("Headphones", 50.00);
		Product charger = new Product("Charger", 35.00);

		Box toolBox = new Box("Tool Box", hammer);
		Box techBox = new Box("Tech Box", phone, headphones);
		Box chargerBox = new Box("Charger Box", charger);
		Box electronicsBox = new Box("Electronics Box", techBox, chargerBox);

		TEST_ORDER_BOX = new Box("Order Box", toolBox, electronicsBox, receipt);
	}

	@Test
	void testGetOrderContent() {
		String actualOrderContent = TEST_ORDER_BOX.getContentAsString(0);

		System.out.println("===== ORDER CONTENT =====");
		System.out.println(actualOrderContent);

		String expectedOrderContent = "Order Box\n" +
				"--Tool Box\n" +
				"----Hammer\n" +
				"--Electronics Box\n" +
				"----Tech Box\n" +
				"------Phone\n" +
				"------Headphones\n" +
				"----Charger Box\n" +
				"------Charger\n" +
				"--Receipt";

		assertEquals(expectedOrderContent, actualOrderContent);
	}

	@Test
	void testGetTotalPrice() {
		double actualTotalPrice = TEST_ORDER_BOX.getTotalPrice();

		System.out.println("===== TOTAL PRICE =====");
		System.out.println(actualTotalPrice);

		double expectedTotalPrice = 605;
		assertEquals(expectedTotalPrice, actualTotalPrice);
	}

}