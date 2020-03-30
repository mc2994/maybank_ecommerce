package com.maybank.exam.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.maybank.exam.dto.ProductDTO;
import com.maybank.exam.dto.converter.ProductDTOConverter;
import com.maybank.exam.entity.Product;
import com.maybank.exam.repository.ProductRepository;

@RestController
@RequestMapping({ "/products" })
public class ProductsController {

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/")
	public ResponseEntity<?> saveProduct(@RequestBody ProductDTO productDto) {
		Product product = productRepository.findByTitle(productDto.getTitle());
		if(product!=null) {
			return new ResponseEntity<String>("Product "+ productDto.getTitle()+" already exists!", HttpStatus.FOUND);
		}
		product = ProductDTOConverter.convertDTOToModel(productDto);
		productRepository.save(product);
		return new ResponseEntity<String>("Product saved!", HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<?> getAllProducts() {
		List<Product> productList = productRepository.findAllProducts();
		if (productList.isEmpty()) {
			return new ResponseEntity<String>("No Products available!", HttpStatus.NOT_FOUND);
		}
		List<ProductDTO> dtoList = ProductDTOConverter.convertModelToDTOList(productList);
		return new ResponseEntity<List<ProductDTO>>(dtoList, HttpStatus.OK);
	}

	@GetMapping(path = { "/{productName}" })
	public ResponseEntity<?> getProduct(@PathVariable String productName) {
		List<Product> productList = productRepository.findProductsByTitle(productName);
		if (productList.isEmpty()) {
			return new ResponseEntity<String>("Product "+productName+" not found!", HttpStatus.NOT_FOUND);
		}
		List<ProductDTO> dtoList = ProductDTOConverter.convertModelToDTOList(productList);
		return new ResponseEntity<List<ProductDTO>>(dtoList, HttpStatus.OK);
	}

	@PutMapping("/")
	public ResponseEntity<?> update(@RequestBody ProductDTO productDto) {
		Product record = productRepository.findByProductId(productDto.getProductId());
		if (record == null) {
			return new ResponseEntity<String>("Product not found!", HttpStatus.NOT_FOUND);
		}
		record = ProductDTOConverter.convertDTOToModel(productDto);
		productRepository.save(record);
		return new ResponseEntity<String>("Product updated!", HttpStatus.OK);
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		Product record = productRepository.findByProductId(id);
		if (record != null) {
			productRepository.deleteById(id);
			return new ResponseEntity<String>("Product deleted!", HttpStatus.OK);
		}
		return new ResponseEntity<String>("Product not found!", HttpStatus.OK);
	}
}