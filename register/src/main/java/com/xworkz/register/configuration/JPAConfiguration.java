package com.xworkz.register.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.xworkz.register")
public class JPAConfiguration {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/register_db");
        ds.setUsername("root");
        ds.setPassword("root");

        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();

        factory.setDataSource(dataSource());
        factory.setPackagesToScan("com.xworkz.register.entity");

        HibernateJpaVendorAdapter adapter =
                new HibernateJpaVendorAdapter();

        factory.setJpaVendorAdapter(adapter);

        return factory;
    }

    @Bean
    public PlatformTransactionManager transactionManager(
            EntityManagerFactory emf) {

        return new JpaTransactionManager(emf);
    }
}
