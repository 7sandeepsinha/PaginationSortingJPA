package dev.sandeep.PaginateAndSort.service;

import dev.sandeep.PaginateAndSort.entity.Product;
import dev.sandeep.PaginateAndSort.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private static final String[] PRODUCT_NAMES = {
            "TV", "Headphones", "Smartphone", "Laptop", "Tablet",
            "Camera", "Speaker", "Drone", "Gaming Console", "Smartwatch",
            "Fitness Tracker", "External Hard Drive", "Monitor", "Router",
            "Printer", "Keyboard", "Mouse", "Earbuds", "Projector", "Desk"
    };
    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public boolean generateProductData() {
        List<Product> products = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String productName = PRODUCT_NAMES[random.nextInt(PRODUCT_NAMES.length)];
            int productPrice = random.nextInt(10000) + 100; // Random price between 100 and 10000
            Product product = new Product(productName, productPrice);
            products.add(product);
        }

        productRepository.saveAll(products);
        return true;
    }
}
