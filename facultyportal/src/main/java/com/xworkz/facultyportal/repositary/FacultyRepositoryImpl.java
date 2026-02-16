package com.xworkz.facultyportal.repositary;



import com.xworkz.facultyportal.entity.FacultyEntity;
import org.springframework.stereotype.Repository;

@Repository
public class FacultyRepositoryImpl implements FacultyRepository {
    @Override
    public void saveDB(FacultyEntity facultyEntity) {
        System.out.println("repository===" + facultyEntity);
    }
}
