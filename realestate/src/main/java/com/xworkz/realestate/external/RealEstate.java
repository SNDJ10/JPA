package com.xworkz.realestate.external;

import com.xworkz.realestate.entity.RealEstateDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RealEstate {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction =entityManager.getTransaction();
        entityTransaction.begin();
        RealEstateDetails realEstateDetails=new RealEstateDetails(4,"jay",202.20);
        entityManager.persist(realEstateDetails);
        entityTransaction.commit();
        entityManager.find(RealEstateDetails.class,4);
        System.out.println(realEstateDetails.toString());
        entityManager.close();
        entityManagerFactory.close();
    }
}
