package com.maybank.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.maybank.exam.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Product findByProductId(Integer id);

	@Query("select p from Product p where p.title like %?1 and isAvailable=1")
	List<Product> findProductsByTitle(String title);
	
	@Query("select p from Product p where p.title=:title ")
	Product findByTitle(@Param("title") String title);
	
	@Query("select p from Product p where p.isAvailable=1")
	List<Product> findAllProducts();
}