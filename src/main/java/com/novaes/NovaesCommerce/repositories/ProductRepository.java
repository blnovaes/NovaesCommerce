/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.novaes.NovaesCommerce.repositories;

import com.novaes.NovaesCommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author blnov
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
    @Query("SELECT obj FROM Product obj "
            + "WHERE UPPER(obj.name) LIKE UPPER(CONCAT('%',:name,'%'))") 
    Page<Product> SearchByname(String name, Pageable pageable);
    
}
