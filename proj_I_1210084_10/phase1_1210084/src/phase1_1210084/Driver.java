package phase1_1210084;
//student name: asmaa Abed Al-Rahman Fares 
//Std.no:1210084
//Section :10L
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		// Create an ArrayList of type PizzaOrder and add five different orders
		ArrayList<PizaaOrder> orders = new ArrayList<PizaaOrder>();
		orders.add(new Delivery("Rana", PizaaOrder.SMALL, 3, 2.5, 15.0, 2));
		orders.add(new Delivery("Suha", PizaaOrder.MEDIUM, 5, 4.0, 20.0, 3));
		orders.add(new ToGo("Ribhi", PizaaOrder.LARGE, 2, 1.0));
		orders.add(new Seated("Jamal", PizaaOrder.MEDIUM, 4, 3.0, 5.0, 4));
		orders.add(new Seated("Ahmad", PizaaOrder.SMALL, 1, 1.5, 8.0, 2));
		
		// Sort orders based on their calculated order price
		sortOrders(orders);
		
		// Print sorted orders' customer names and prices
		System.out.println("Sorted Pizza Orders:");
		for (PizaaOrder order : orders) {
			order.printOrderInfo();
		}
		
		// Print the total sum of all order prices
		double totalPrice = calculateTotalOrdersPrice(orders);
		System.out.println("\nTotal orders price: " + totalPrice);
		
		// Print a report for the second Delivery order
		System.out.println("\nReport for the second Delivery order:");
		System.out.println(orders.get(1).toString());
	}
	
	public static void sortOrders(ArrayList<PizaaOrder> orders) {
		Collections.sort(orders);
	}
	
	public static double calculateTotalOrdersPrice(ArrayList<PizaaOrder> orders) {
		double totalPrice = 0;
		for (PizaaOrder order : orders) {
			totalPrice += order.calculateOrderPrice();
		}
		return totalPrice;
	}
}


