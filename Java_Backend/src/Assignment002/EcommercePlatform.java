package Assignment002;

import java.util.Collections;
import java.util.Scanner;

public class EcommercePlatform {

	public static void main(String[] args) {
        ProductSorter productSorter = new ProductSorter();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;

        productSorter.addProduct(new Product("Laptop", 800.00, 4.5, 500));
        productSorter.addProduct(new Product("Wireless Earbuds", 70, 3.5, 70));
        productSorter.addProduct(new Product("Headphones", 850, 2.5, 95));
        productSorter.addProduct(new Product("Smartphone", 600, 4.0, 90));
        productSorter.addProduct(new Product("Tablet", 50, 5.0, 65));
        
        while (!exit) {
            System.out.println("\n-----Menu-----");
            System.out.println("1. Add Product");
            System.out.println("2. Sort Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter product rating:(1-5) ");
                    double rating = scanner.nextDouble();

                    System.out.print("Enter product popularity: ");
                    int popularity = scanner.nextInt();

                    Product product = new Product(name, price, rating, popularity);
                    productSorter.addProduct(product);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.println("\nWhat would you like to sort by?");
                    System.out.println("1. Name");
                    System.out.println("2. Price");
                    System.out.println("3. Rating");
                    System.out.println("4. Popularity");
                    System.out.print("Enter your choice: ");

                    int sortingOption = scanner.nextInt();

                    System.out.println("\nSort Order:");
                    System.out.println("1. Low to High");
                    System.out.println("2. High to Low");
                    System.out.println("Enter your choice: ");

                    int sortOrder = scanner.nextInt();

                    switch (sortingOption) {
                    case 1: // Sort by Name
                        if (sortOrder == 1) {
                            Collections.sort(productSorter.getProducts()); 
                            System.out.println("\nProducts Sorted by Name: ");
                        } else if (sortOrder == 2) {
                            Collections.sort(productSorter.getProducts(), new NameComparatorReverse());
                            System.out.println("\nProducts Sorted by Name (Reverse): ");
                        } else {
                            System.out.println("Invalid sort order!");
                            break;
                        }
                        productSorter.displayProducts();
                        break;

                    case 2: // Sort by Price
                        if (sortOrder == 1) {
                            Collections.sort(productSorter.getProducts(), new PriceComparatorLowToHigh());
                            System.out.println("\nProducts Sorted by Price (Low to High): ");
                        } else if (sortOrder == 2) {
                            Collections.sort(productSorter.getProducts(), new PriceComparatorHighToLow());
                            System.out.println("\nProducts Sorted by Price (High to Low): ");
                        } else {
                            System.out.println("Invalid sort order!");
                            break;
                        }
                        productSorter.displayProducts();
                        break;

                    case 3: // Sort by Rating
                        if (sortOrder == 1) {
                            Collections.sort(productSorter.getProducts(),new RatingComparatorLowToHigh());
                            System.out.println("\nProducts Sorted by Rating (Low to High): ");
                        } else if (sortOrder == 2) {
                            Collections.sort(productSorter.getProducts(),new RatingComparatorHighToLow());
                            System.out.println("\nProducts Sorted by Rating (High to Low): ");
                        } else {
                            System.out.println("Invalid sort order!");
                            break;
                        }
                        productSorter.displayProducts();
                        break;

                    case 4: // Sort by Popularity
                        if (sortOrder == 1) {
                            Collections.sort(productSorter.getProducts(), new PopularityComparatorLowToHigh());
                            System.out.println("\nProducts Sorted by Popularity (Low to High): ");
                        } else if (sortOrder == 2) {
                            Collections.sort(productSorter.getProducts(), new PopularityComparatorHighToLow());
                            System.out.println("\nProducts Sorted by Popularity (High to Low): ");
                        } else {
                            System.out.println("Invalid sort order!");
                            break;
                        }
                        productSorter.displayProducts();
                        break;

                    default:
                        System.out.println("Invalid sorting option! Please try again.");
                }
                break;

                case 3:
                    exit = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}
