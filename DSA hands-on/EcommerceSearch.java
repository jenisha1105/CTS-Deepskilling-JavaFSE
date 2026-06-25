class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

class SearchEngine {

    public static Product linearSearch(Product[] products, String name) {

        for (Product p : products) {

            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }

        return null;
    }
}

public class EcommerceSearch {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Headphones", "Electronics"),
                new Product(105, "Keyboard", "Computer Accessories")
        };

        Product result =
                SearchEngine.linearSearch(products, "Mobile");

        if (result != null) {

            System.out.println("Product Found");
            System.out.println("Product ID : " + result.productId);
            System.out.println("Product Name : " + result.productName);
            System.out.println("Category : " + result.category);

        } else {

            System.out.println("Product Not Found");
        }
    }
}
