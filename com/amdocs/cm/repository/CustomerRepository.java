package com.amdocs.cm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmailAddress(String emailAddress);
}