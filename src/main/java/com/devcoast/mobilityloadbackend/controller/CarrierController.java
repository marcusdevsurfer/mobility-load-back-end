package com.devcoast.mobilityloadbackend.controller;
import com.devcoast.mobilityloadbackend.entity.Carrier;
import com.devcoast.mobilityloadbackend.entity.Unit;
import com.devcoast.mobilityloadbackend.service.CarrierService;
import com.devcoast.mobilityloadbackend.service.UnitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CarrierController {
    private final CarrierService carrierService;
    private final UnitService unitService;

    public CarrierController(CarrierService carrierService, UnitService unitService){
        this.carrierService = carrierService;
        this.unitService = unitService;
    }

    //Retrieve all Carriers
    @GetMapping("/carriers")
    public ResponseEntity<List<Carrier>> retrieveAllCarriers() {
        return new ResponseEntity<>(carrierService.getAllCarriers(), HttpStatus.OK);
    }

    //Retrieve Carrier by ID
    @GetMapping("/carriers/{id}")
    public ResponseEntity<Carrier> retrieveCarrierById(@PathVariable("id") Long carrierId) {
        return carrierService.getCarrierById(carrierId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Retrieve Carrier by Email
    @GetMapping("/carriers/query")
    public ResponseEntity<Carrier> retrieveCarrierByEmail(
            @RequestParam("email") String email){
        return carrierService.getCarrierByEmail(email)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    //Retrieve units by Carrier ID
    @GetMapping("/carriers/{id}/units")
    public ResponseEntity<List<Unit>> retrieveUnitsByCarrierId(@PathVariable("id") Long carrierId){
        return new ResponseEntity<>(unitService.getUnitsByCarrierId(carrierId),HttpStatus.OK);
    }

    //Add a new Carrier
    @PostMapping("/carriers")
    public ResponseEntity<Carrier> saveCarrier(@RequestBody Carrier carrier) {
        return new ResponseEntity<>(carrierService.saveCarrier(carrier),HttpStatus.CREATED);
    }
}
