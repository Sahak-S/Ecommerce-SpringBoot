package com.ecommerce.library.library.repository;

import com.ecommerce.library.library.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByUsername(String username);
}
