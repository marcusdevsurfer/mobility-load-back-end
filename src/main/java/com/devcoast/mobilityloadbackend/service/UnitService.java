package com.devcoast.mobilityloadbackend.service;

import com.devcoast.mobilityloadbackend.entity.Unit;
import com.devcoast.mobilityloadbackend.repository.UnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitService {
    private final UnitRepository unitRepository;
    public UnitService(UnitRepository unitRepository){
        this.unitRepository = unitRepository;
    }

    public List<Unit> getAllUnits(){
        return unitRepository.findAll();
    }

    public Unit saveUnit(Unit unit){
        return unitRepository.save(unit);
    }

    public Optional<Unit> getUnitById(Long unitId){
       return unitRepository.findById(unitId);
    }
}
