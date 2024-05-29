package dev.prashant.productService.service;

import dev.prashant.productService.exception.ProductNotFoundException;
import dev.prashant.productService.dto.CreateProductRequestDTO;
import dev.prashant.productService.dto.ProductResponseDTO;
import dev.prashant.productService.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<ProductResponseDTO> getAllProducts();
    ProductResponseDTO getProduct(UUID productId) throws ProductNotFoundException;
    ProductResponseDTO createProduct(CreateProductRequestDTO product);
    ProductResponseDTO updateProduct(CreateProductRequestDTO updatedProduct, UUID productId);
    boolean deleteProduct(UUID productId);
    ProductResponseDTO getProduct(String productName);
    List<Product> getProducts(double minPrice, double maxPrice);
}
