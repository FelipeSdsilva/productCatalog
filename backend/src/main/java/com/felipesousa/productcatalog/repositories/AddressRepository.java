package com.felipesousa.productcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipesousa.productcatalog.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
