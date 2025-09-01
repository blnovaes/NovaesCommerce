/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novaes.NovaesCommerce.services;

import com.novaes.NovaesCommerce.dto.ProductDTO;
import com.novaes.NovaesCommerce.entities.Product;
import com.novaes.NovaesCommerce.repositories.ProductRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author blnov
 */
@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;
    
    /**
     *
     * @param id
     * @return
     */
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;
    }
    
}
