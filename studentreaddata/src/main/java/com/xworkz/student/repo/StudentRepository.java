package com.xworkz.student.repo;

import com.xworkz.student.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentRepository {
    void saveDB(StudentEntity studentEntity);
    List<StudentEntity> getDBData();

}
