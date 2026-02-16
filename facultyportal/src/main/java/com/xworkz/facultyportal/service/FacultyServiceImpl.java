package com.xworkz.facultyportal.service;



import com.xworkz.facultyportal.dto.FacultyDTO;
import com.xworkz.facultyportal.entity.FacultyEntity;
import com.xworkz.facultyportal.repositary.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    FacultyRepository facultyRepository;

    @Override
    public void saveValidation(FacultyDTO facultyDTO) {

        System.out.println("DTO service===" + facultyDTO);

        FacultyEntity facultyEntity = new FacultyEntity();
        facultyEntity.setAge(facultyDTO.getAge());
        facultyEntity.setName(facultyDTO.getName());
        facultyEntity.setCllgName(facultyDTO.getCllgName());
        facultyEntity.setPhNumber(facultyDTO.getPhNumber());


        facultyRepository.saveDB(facultyEntity);


    }
}