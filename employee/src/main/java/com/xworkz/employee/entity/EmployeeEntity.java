package com.xworkz.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employee_tb")
public class EmployeeEntity {
    @Id
    private int id;
    private String employeeName;
    private String email;
    private double salary;
    private String department;

}
