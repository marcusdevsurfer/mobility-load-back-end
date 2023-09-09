package com.devcoast.mobilityloadbackend.service;

import com.devcoast.mobilityloadbackend.entity.Carrier;
import com.devcoast.mobilityloadbackend.repository.CarrierRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CarrierService {

    private final CarrierRepository carrierRepository;

    public CarrierService(CarrierRepository carrierRepository){
        this.carrierRepository =carrierRepository;
    }

    //Method to retrieve all carriers.
    public List<Carrier> getAllCarriers() {
        return carrierRepository.findAll();
    }

    //Method to retrieve carrier by id
    public Optional<Carrier> getCarrierById(Long carrierId){
        return carrierRepository.findById(carrierId);
    }

    //Method for save carrier
    public Carrier saveCarrier(Carrier carrier){
        return carrierRepository.save(carrier);
    }
}
