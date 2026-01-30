package com.xworkz.mall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mallDetails")
public class MallDetails {
    @Id
    private int age;
    private String name;
    private long phoneNumber;
    private String email;

}
