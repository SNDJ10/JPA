package com.xworkz.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "std_tb")
@NamedQuery(name = "readAll",query = "select e from StudentEntity e")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String college;
    private long mobileNumber;
    private String gender;
    private String qualification;
}
