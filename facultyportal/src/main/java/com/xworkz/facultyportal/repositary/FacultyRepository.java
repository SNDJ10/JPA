package com.xworkz.facultyportal.repositary;



import com.xworkz.facultyportal.entity.FacultyEntity;

public interface FacultyRepository {
    public abstract void saveDB(FacultyEntity facultyEntity);
}