package com.xworkz.product.repo;



import com.xworkz.product.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean saveProduct(ProductEntity entity) {
        EntityManager em = factory.createEntityManager();
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(entity);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public ProductEntity findByEmail(String email) {
        EntityManager em = factory.createEntityManager();
        try {
            Query query = em.createNamedQuery("findByEmail");
            query.setParameter("email", email);
            return (ProductEntity) query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public List<ProductEntity> fetchAllProducts() {
        EntityManager em = factory.createEntityManager();
        try {
            Query query = em.createNamedQuery("fetchAllProducts");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public ProductEntity findById(Integer id) {
        EntityManager em = factory.createEntityManager();
        try {
            return em.find(ProductEntity.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public boolean updateProduct(ProductEntity entity) {
        EntityManager em = factory.createEntityManager();
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.merge(entity);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            em.close();
        }
    }
}