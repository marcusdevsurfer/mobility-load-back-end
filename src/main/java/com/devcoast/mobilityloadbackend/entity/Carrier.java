package com.devcoast.mobilityloadbackend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "carriers")
public class Carrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "carrier_name")
    private String name;

    @Column(name = "carrier_email")
    private String email;

    public Carrier() {
    }

    public Long getCarrierId() {
        return id;
    }

    public void setCarrierId(Long id) {
        this.id = id;
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
}
