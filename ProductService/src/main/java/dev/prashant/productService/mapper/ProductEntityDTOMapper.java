package dev.prashant.productService.mapper;

import dev.prashant.productService.dto.CreateProductRequestDTO;
import dev.prashant.productService.dto.ProductResponseDTO;
import dev.prashant.productService.entity.Product;

public class ProductEntityDTOMapper {

    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product){
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setTitle(product.getTitle());
        responseDTO.setRating(product.getRating());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setImageURL(product.getImageURL());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setCategory(product.getCategory().getName());
        return responseDTO;
    }

    public static Product convertCreateProductRequestDTOToProduct(CreateProductRequestDTO productRequestDTO){
        Product product = new Product();
        product.setTitle(productRequestDTO.getTitle());
        product.setRating(0);
        product.setPrice(productRequestDTO.getPrice());
        product.setImageURL(productRequestDTO.getImageURL());
        product.setDescription(productRequestDTO.getDescription());
        return product;
    }
}
