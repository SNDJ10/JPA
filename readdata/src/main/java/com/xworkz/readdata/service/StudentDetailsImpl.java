package com.xworkz.readdata.service;

import com.xworkz.readdata.dao.StudentDAOImpl;
import com.xworkz.readdata.dto.StudentDetails;
import com.xworkz.readdata.entity.StudetDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentDetailsImpl implements StudentDetailsService{

    @Autowired
    StudentDAOImpl studentDAO;
    @Override
    public void saveData(StudentDetails studentDetails) {
        System.out.println("this is service"  +studentDetails);

        StudetDetailsEntity studetDetailsEntity=new StudetDetailsEntity();


        studetDetailsEntity.setName(studentDetails.getName());
        studetDetailsEntity.setCollege(studentDetails.getCollege());
        studentDAO.saveDB(studetDetailsEntity);
    }

    @Override
    public List<StudentDetails> getDtos() {

        List<StudetDetailsEntity> studetDetailsEntities=studentDAO.getTraineeData();
        if (!studetDetailsEntities.isEmpty()) {
            List<StudentDetails> student =new ArrayList<>();
            studetDetailsEntities.forEach(studetDetailsEntity -> {
                StudentDetails studentDetails = new StudentDetails();
                studentDetails.setName(studetDetailsEntity.getName());
                studentDetails.setCollege(studetDetailsEntity.getCollege());
                student.add(studentDetails);
            });
           return student;
        }else {
            return Collections.emptyList();
        }
    }
}
