
package com.xworkz.crudoperation.create;

import com.xworkz.crudoperation.entity.BusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BusCreate {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        BusEntity busEntity = new BusEntity(5,"Pune","MH52CJ5252",300);
        entityManager.persist(busEntity);
         BusEntity entity=entityManager.find(BusEntity.class,5);
        System.out.println(entity.toString());
        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
