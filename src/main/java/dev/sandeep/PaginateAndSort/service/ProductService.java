package dev.sandeep.PaginateAndSort.service;

import dev.sandeep.PaginateAndSort.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    boolean generateProductData();

}
