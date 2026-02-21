package com.xworkz.collegedetails.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "college_tb")
@NamedQuery(name = "collegeData",query = "select e from CollegeEntity e")
public class CollegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String collegeName;
    private String collegeBranch;
    private long mobileNumber;
}
