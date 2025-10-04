package collections;

import java.util.HashMap;
import java.util.Map;

public class ProductDetails {

	public static void main(String[] args) {
		// Product Name and ID
		Map<String, String> productName = new HashMap<String, String>();
		productName.put("Laptop", "P001");
		productName.put("Desk Chair", "P002");
		productName.put("Coffee Maker", "P003");
		System.out.println("Product Name and ID: "+productName);
		
		      // Product Category
				Map<String, String> productCat = new HashMap<String, String>();
				productCat.put("Laptop", "Electronics");
				productCat.put("Desk Chair", "Furniture");
				productCat.put("Coffee Maker", "Kitchen");
				System.out.println("Product Category: "+productCat);
				
			      // Product Price
					Map<String, String> productPrice = new HashMap<String, String>();
					productPrice.put("Laptop", "12K Pounds");
					productPrice.put("Desk Chair", "150K Pounds");
					productPrice.put("Coffee Maker", "75 Pounds");
					System.out.println("Product Price: "+productPrice);
					
					 // Product Stock Quantity
					Map<String, String> productQuant = new HashMap<String, String>();
					productQuant.put("Laptop", "Not Available");
					productQuant.put("Desk Chair", "Two");
					productQuant.put("Coffee Maker", "Two Hundred");
					System.out.println("Product Stock Quantity: "+productQuant);
					
					 // Product Supplier
					Map<String, String> productSuplier = new HashMap<String, String>();
					productSuplier.put("Laptop", "Tech Supplies");
					productSuplier.put("Desk Chair", "Office Depot");
					productSuplier.put("Coffee Maker", "KitchenWorld");
					System.out.println("Product Supplier: "+productSuplier);
					
					 // Product Warranty
					Map<String, String> productWarant = new HashMap<String, String>();
					productWarant.put("Laptop", "2 years");
					productWarant.put("Desk Chair", "1 year");
					productWarant.put("Coffee Maker", "6 months");
					System.out.println("Product Warranty: "+productWarant);
					
					 // Product Rating
					Map<String, String> productRating = new HashMap<String, String>();
					productRating.put("Laptop", "4.5 Stars");
					productRating.put("Desk Chair", "4 Stars");
					productRating.put("Coffee Maker", "4.2 Stars");
					System.out.println("Product Rating: "+productRating);
					
					 // Product Manufacturing Date
					Map<String, String> productMandate = new HashMap<String, String>();
					productMandate.put("Laptop", "Aug 2023");
					productMandate.put("Desk Chair", "Sep 2024");
					productMandate.put("Coffee Maker", "Jan 2025");
					System.out.println("Product Manufacturing Date: "+productMandate);
					
					 // Product Expiry Date
					Map<String, String> productExpdate = new HashMap<String, String>();
					productExpdate.put("Laptop", "Aug 2028");
					productExpdate.put("Desk Chair", "N/A");
					productExpdate.put("Coffee Maker", "Jan 2027");
					System.out.println("Product Expiry Date: "+productExpdate);
					System.out.println("Product suplier name: "+productSuplier.get("Desk Chair"));
					
					
		
		

	}

}
