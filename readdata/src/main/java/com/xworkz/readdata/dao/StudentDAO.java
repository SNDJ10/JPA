package com.xworkz.readdata.dao;

import com.xworkz.readdata.entity.StudetDetailsEntity;

import java.util.List;


public interface StudentDAO {
    void saveDB(StudetDetailsEntity studetDetailsEntity);
    List<StudetDetailsEntity> getTraineeData();
}
