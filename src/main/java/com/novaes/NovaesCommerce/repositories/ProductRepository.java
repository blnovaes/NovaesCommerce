/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.novaes.NovaesCommerce.repositories;

import com.novaes.NovaesCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author blnov
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
