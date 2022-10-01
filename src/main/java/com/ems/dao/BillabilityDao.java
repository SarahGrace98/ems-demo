package com.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entity.Billability;

@Repository
public interface BillabilityDao extends JpaRepository<Billability, Integer>{

}
