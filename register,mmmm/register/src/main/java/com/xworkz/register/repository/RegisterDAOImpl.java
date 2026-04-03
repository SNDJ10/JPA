package com.xworkz.register.repository;

import com.xworkz.register.entity.RegisterEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class RegisterDAOImpl implements RegisterDAO{
    @Override
    public void saveData(RegisterEntity registerEntity) {
        System.out.println("this is database==="+registerEntity);
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("register");
       EntityManager entityManager= null;
       try {

             entityManager  =entityManagerFactory.createEntityManager();
           EntityTransaction entityTransaction = entityManager.getTransaction();
           entityTransaction.begin();
           entityManager.persist(registerEntity);
           entityTransaction.commit();

       }catch (Exception exception){
         exception.printStackTrace();
       }finally {

           entityManagerFactory.close();
           entityManager.close();
       }
    }
}
