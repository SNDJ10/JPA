package com.xworkz.budget.update;

import com.xworkz.budget.entity.BudgetEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BudgetUpdate {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
BudgetEntity entity=new BudgetEntity(1,"dfgh","thied",12000);
        BudgetEntity budgetEntity = entityManager.find(BudgetEntity.class, 5);
        budgetEntity.setAmount(5);

        transaction.commit();
        entityManager.close();
        factory.close();
    }
}
