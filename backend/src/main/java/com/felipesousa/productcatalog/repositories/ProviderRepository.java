package com.felipesousa.productcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipesousa.productcatalog.entities.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Long>{

}
