package com.xworkz.student.repo;

import com.xworkz.student.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
@Repository
public class StudentRepositoryImpl implements StudentRepository{
    @Autowired
   private EntityManagerFactory entityManagerFactory;
    @Override
    public void saveDB(StudentEntity studentEntity) {
        System.out.println("this is db"+studentEntity);

        EntityManager entityManager = null;
        try {


            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(studentEntity);
            entityTransaction.commit();
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
//            entityManagerFactory.close();
            entityManager.close();
        }
    }

    @Override
    public List<StudentEntity> getDBData() {

        EntityManager entityManager=entityManagerFactory.createEntityManager();
        try {
            EntityTransaction entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();
            Query query=entityManager.createNamedQuery("readAll");
            List<StudentEntity> entityList=(List<StudentEntity>) query.getResultList();
            System.out.println(entityList);

            entityTransaction.commit();
            return entityList;
        }catch (Exception exception){
            return Collections.emptyList();
        }finally {
//            entityManagerFactory.close();
            entityManager.close();
        }


    }

}
