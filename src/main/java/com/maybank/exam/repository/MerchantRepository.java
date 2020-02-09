package com.maybank.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maybank.exam.entity.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Integer> {

}
