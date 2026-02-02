package com.xworkz.budget.create;

import com.xworkz.budget.entity.BudgetEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BudgetCreate {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        BudgetEntity budgetEntity = new BudgetEntity(5, "Pune", "MH52CJ5252", 300);
        entityManager.persist(budgetEntity);

        BudgetEntity entity = entityManager.find(BudgetEntity.class, 5);
        System.out.println(entity.toString());

        transaction.commit();
        entityManager.close();
        factory.close();
    }
}

