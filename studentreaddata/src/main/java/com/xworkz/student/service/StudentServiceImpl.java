package com.xworkz.student.service;

import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.entity.StudentEntity;
import com.xworkz.student.repo.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void saveData(StudentDTO studentDTO) {
        System.out.println("this is service"+studentDTO);
        StudentEntity studentEntity=new StudentEntity();
        BeanUtils.copyProperties(studentDTO,studentEntity);
        studentRepository.saveDB(studentEntity);


    }

    @Override
    public List<StudentDTO> getDtos() {
        List<StudentEntity> entities=studentRepository.getDBData();
        if (!entities.isEmpty()) {
            List<StudentDTO> dtoList=new ArrayList<>();
            entities.forEach(studentEntity -> {
                StudentDTO dto=new StudentDTO();
                BeanUtils.copyProperties(studentEntity,dto);
                dtoList.add(dto);
            });
            return dtoList;
        }else {


            return Collections.emptyList();
        }
    }
}
