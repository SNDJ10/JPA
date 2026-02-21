package com.xworkz.collegedetails.repository;

import com.xworkz.collegedetails.entity.CollegeEntity;

import java.util.List;

public interface CollegeDAO {
    void saveDb(CollegeEntity collegeEntity);
    List<CollegeEntity> getColegeData();
}
