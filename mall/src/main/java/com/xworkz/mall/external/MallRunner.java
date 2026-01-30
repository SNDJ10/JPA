package com.xworkz.mall.external;

import com.xworkz.mall.entity.MallDetails;

import javax.persistence.*;

public class MallRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction =entityManager.getTransaction();
        entityTransaction.begin();
        MallDetails mallDetails=new MallDetails(38,"mak",8877996565l,"mark@123");
        entityManager.persist(mallDetails);
        entityTransaction.commit();
       MallDetails entity= entityManager.find(MallDetails.class,38);

        System.out.println(entity.toString());
        entityManager.close();
        entityManagerFactory.close();
    }
}
