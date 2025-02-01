package Assignment002;


public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private double rating;
    private long popularity;

    public Product(String name, double price, double rating, long popularity) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.popularity = popularity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public long getPopularity() {
        return popularity;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return String.format(
            "| %-15s | %-10s | %-8s | %-10s |\n" +
            "| %-15s | %-10.2f | %-8.1f | %-10d |\n" ,
            "Name", "Price", "Rating", "Popularity", 
            name, price, rating, popularity);
        
    }

}


