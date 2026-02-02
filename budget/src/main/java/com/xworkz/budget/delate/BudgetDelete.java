package com.xworkz.budget.delate;

import com.xworkz.budget.entity.BudgetEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BudgetDelete {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        BudgetEntity budgetEntity = entityManager.find(BudgetEntity.class, 5);
        entityManager.remove(budgetEntity);

        transaction.commit();
        entityManager.close();
        factory.close();
    }
}
