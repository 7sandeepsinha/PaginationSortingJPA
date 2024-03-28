package dev.sandeep.PaginateAndSort;

import dev.sandeep.PaginateAndSort.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/generate")
    public ResponseEntity generateData(){
        return ResponseEntity.ok(
                productService.generateProductData()
        );
    }
}
// break -> 8:03 PM