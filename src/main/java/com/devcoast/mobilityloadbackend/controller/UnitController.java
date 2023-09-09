package com.devcoast.mobilityloadbackend.controller;

import com.devcoast.mobilityloadbackend.entity.Unit;
import com.devcoast.mobilityloadbackend.service.UnitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UnitController {

    private final UnitService unitService;

    public UnitController(UnitService unitService){
        this.unitService = unitService;
    }

    @GetMapping("/units")
    public ResponseEntity<List<Unit>> retrieveUnits(){
        return new ResponseEntity<>(unitService.getAllUnits(),HttpStatus.OK);
    }

    @PostMapping("/units")
    public ResponseEntity<Unit> saveUnit(@RequestBody Unit unit){
        return new ResponseEntity<>(unitService.saveUnit(unit), HttpStatus.OK);
    }
}
