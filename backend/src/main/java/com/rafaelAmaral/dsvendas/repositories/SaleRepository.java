package com.rafaelAmaral.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelAmaral.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
