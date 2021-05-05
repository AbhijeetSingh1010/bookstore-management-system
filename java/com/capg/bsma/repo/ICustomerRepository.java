package com.capg.bsma.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.bsma.entity.CustomerEntity;

//this interface includes all crud repository methods
@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
