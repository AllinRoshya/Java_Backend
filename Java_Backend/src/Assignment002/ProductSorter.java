package Assignment002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ProductSorter {
	ArrayList<Product> products;

	public ProductSorter() {
		products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void sortProduct() {
		Collections.sort(products);
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void displayProducts() {
		for (Product product : products) {
			System.out.println("------------------------------------------------------------");
			System.out.println(product);

		}
	}
}

class NameComparatorReverse implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return p2.getName().compareTo(p1.getName());
	}
}

class PriceComparatorLowToHigh implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
}

class PriceComparatorHighToLow implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return Double.compare(p2.getPrice(), p1.getPrice());
	}
}

class RatingComparatorLowToHigh implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return Double.compare(p1.getRating(), p2.getRating());
	}
}

class RatingComparatorHighToLow implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return Double.compare(p2.getRating(), p1.getRating());
	}
}

class PopularityComparatorLowToHigh implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return Long.compare(p1.getPopularity(), p2.getPopularity());
	}
}

class PopularityComparatorHighToLow implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return Long.compare(p2.getPopularity(), p1.getPopularity());
	}
}
