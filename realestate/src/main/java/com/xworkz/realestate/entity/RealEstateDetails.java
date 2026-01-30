package com.xworkz.realestate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "realEstateDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RealEstateDetails {
    @Id
    private int id;
    private  String name;
    private double amount;
}
