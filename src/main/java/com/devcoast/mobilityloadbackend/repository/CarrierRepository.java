package com.devcoast.mobilityloadbackend.repository;

import com.devcoast.mobilityloadbackend.entity.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierRepository extends JpaRepository<Carrier,Long> {
}
