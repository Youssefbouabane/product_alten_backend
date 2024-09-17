package com.alt.products.services;

import com.alt.products.entities.Product;
import com.alt.products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        return productRepository.findById(id).map(product -> {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            product.setQuantity(productDetails.getQuantity());
            product.setInventoryStatus(productDetails.getInventoryStatus());
            product.setRating(productDetails.getRating());
            product.setUpdatedAt(productDetails.getUpdatedAt());
            return productRepository.save(product);
        }).orElseThrow(() -> null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
