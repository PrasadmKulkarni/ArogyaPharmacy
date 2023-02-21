package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.SupplyOffice;
@Repository
public interface SupplyOfficeRepository extends JpaRepository<SupplyOffice, Integer>{

}
