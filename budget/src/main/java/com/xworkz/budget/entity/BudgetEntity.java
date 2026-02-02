package com.xworkz.budget.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "budgetEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetEntity {

    @Id
    private int id;
    private String budgetCapacity;
    private String quater;
    private int amount;

}

