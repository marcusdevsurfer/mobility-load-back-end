package com.devcoast.mobilityloadbackend.repository;

import com.devcoast.mobilityloadbackend.entity.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarrierRepository extends JpaRepository<Carrier,Long> {
    //TODO : Create method to find Carrier by email
    Optional<Carrier> findByEmail(String email);
}
