package com.xworkz.letter.external;

import com.xworkz.letter.entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();


        List<StudentEntity> list = new ArrayList<>();

        list.add(new StudentEntity(101, "Lavanya", 20, 7774532476L));
        list.add(new StudentEntity(102, "Pramila", 20, 999996546L));

        for (StudentEntity student : list) {
            em.persist(student);
        }

        StudentEntity data = em.find(StudentEntity.class, 102);
        et.commit();
        if (data != null) {
            System.out.println("Fetched Data: " + data);
        } else {
            System.out.println("Student not found");
        }


        if (data != null) {
            data.setStudentName("Rony");
            em.merge(data);
        }


        if (data != null) {
            em.remove(data);
        }

        et.commit();

        em.close();
        emf.close();
    }
}
