package com.devcoast.mobilityloadbackend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "carriers")
public class Carrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carrierId;

    @Column(name = "carrier_name")
    private String name;

    @Column(name = "carrier_email")
    private String email;
    @OneToMany
    private List<Unit> unitList;

    public Carrier() {
    }

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<Unit> unitList) {
        this.unitList = unitList;
    }
}
