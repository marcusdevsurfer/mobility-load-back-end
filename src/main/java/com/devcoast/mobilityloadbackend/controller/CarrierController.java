package com.devcoast.mobilityloadbackend.controller;

import com.devcoast.mobilityloadbackend.entity.Carrier;
import com.devcoast.mobilityloadbackend.entity.Unit;
import com.devcoast.mobilityloadbackend.service.CarrierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarrierController {

    private final CarrierService carrierService;

    public CarrierController(CarrierService carrierService){
        this.carrierService = carrierService;
    }

    @GetMapping("/carriers")
    public ResponseEntity<List<Carrier>> retrieveAllCarriers() {
        return new ResponseEntity<>(carrierService.getAllCarriers(), HttpStatus.OK);
    }

    @GetMapping("/carriers/{id}")
    public ResponseEntity<Carrier> retrieveCarrierById(@PathVariable("id") Long carrierId){
        return carrierService.getCarrierById(carrierId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/carriers/{id}/units")
    public ResponseEntity<List<Unit>> retrieveUnitsByCarrierId(@PathVariable("id") Long carrierId){
        Optional<Carrier> carrier = carrierService.getCarrierById(carrierId);
        return carrier.map(Carrier::getUnitList)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/carriers")
    public ResponseEntity<Carrier> saveCarrier(@RequestBody Carrier carrier) {
        return new ResponseEntity<>(carrierService.saveCarrier(carrier),HttpStatus.CREATED);
    }


}
