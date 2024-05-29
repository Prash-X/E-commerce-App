package dev.prashant.productService.mapper;

import dev.prashant.productService.dto.CategoryResponseDTO;
import dev.prashant.productService.dto.CreateCategoryRequestDTO;
import dev.prashant.productService.dto.ProductResponseDTO;
import dev.prashant.productService.entity.Category;
import dev.prashant.productService.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryEntityDTOMapper {

    public static CategoryResponseDTO convertCategoryToCategoryResponseDTO(Category category){
        //call product entity to product response dto mapper
        CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO();
        categoryResponseDTO.setCategoryName(category.getName());
        List<ProductResponseDTO> productResponseDTOs = new ArrayList<>();
        if(!(category.getProducts() == null || category.getProducts().isEmpty())) {
            for (Product product : category.getProducts()) {
                productResponseDTOs.add(ProductEntityDTOMapper.convertProductEntityToProductResponseDTO(product));
            }
        }
        categoryResponseDTO.setProducts(productResponseDTOs);
        return categoryResponseDTO;
    }

    public static Category convertCreateCategoryDTOToCategory(CreateCategoryRequestDTO createCategoryRequestDTO){
        Category category = new Category();
        category.setName(createCategoryRequestDTO.getCategoryName());
        return category;
    }
}
