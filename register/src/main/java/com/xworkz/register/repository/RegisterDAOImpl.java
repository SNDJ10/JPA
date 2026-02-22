package com.xworkz.register.repository;

import com.xworkz.register.entity.RegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class RegisterDAOImpl implements RegisterDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void saveData(RegisterEntity entity) {
        entityManager.persist(entity);
    }

    @Override
    public RegisterEntity findByGmail(String gmail) {

        try {
            return entityManager.createQuery(
                            "SELECT u FROM RegisterEntity u WHERE u.gmail = :email",
                            RegisterEntity.class)
                    .setParameter("email", gmail)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
