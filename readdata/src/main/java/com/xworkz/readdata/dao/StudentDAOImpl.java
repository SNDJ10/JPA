package com.xworkz.readdata.dao;

import com.xworkz.readdata.entity.StudetDetailsEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    @Override
    public void saveDB(StudetDetailsEntity studetDetailsEntity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("readdata");
        EntityManager entityManager = null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(studetDetailsEntity);
            entityTransaction.commit();

        } catch (Exception exception) {
            exception.printStackTrace();

        } finally {
            entityManagerFactory.close();
            entityManager.close();
        }
    }

    @Override
    public List<StudetDetailsEntity> getTraineeData() {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("readdata");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        try {
          EntityTransaction entityTransaction = entityManager.getTransaction();
          entityTransaction.begin();
        Query query = entityManager.createNamedQuery("readAll");
          List<StudetDetailsEntity> entities  =(List<StudetDetailsEntity>)query.getResultList();
            System.out.println(entities);
            return entities;
        }catch (Exception exception){
            return Collections.emptyList();
        }finally {
            entityManagerFactory.close();
            entityManager.close();
        }

    }

}
