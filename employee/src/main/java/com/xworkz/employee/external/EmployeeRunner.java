package com.xworkz.employee.external;

import com.xworkz.employee.entity.EmployeeEntity;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.FileInputStream;
import java.io.IOException;

public class EmployeeRunner {

    public static void main(String[] args) {

        String excelPath = "C:\\Users\\sanja\\OneDrive\\Documents\\employee_db.xlsx";

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("employee");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try (FileInputStream fileInputStream = new FileInputStream(excelPath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            entityTransaction.begin();

            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                Row row = sheet.getRow(i);

                EmployeeEntity employee = new EmployeeEntity();

                employee.setId((int) row.getCell(0).getNumericCellValue());
                employee.setEmployeeName(row.getCell(1).getStringCellValue());
                employee.setEmail(row.getCell(2).getStringCellValue());
                employee.setSalary(row.getCell(3).getNumericCellValue());
                employee.setDepartment(row.getCell(4).getStringCellValue());

                entityManager.persist(employee);
            }

            entityTransaction.commit();
            System.out.println(" Employee Excel data inserted into DB successfully");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}

