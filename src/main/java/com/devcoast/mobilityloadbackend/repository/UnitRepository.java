package com.devcoast.mobilityloadbackend.repository;

import com.devcoast.mobilityloadbackend.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitRepository extends JpaRepository<Unit,Long> {
    List<Unit> findByCarrierId(Long carrierId);
}
