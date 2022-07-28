package com.SpringBoot.demo.Service;



import java.util.List;

import com.SpringBoot.demo.entity.EmployeeEntity;


public interface EmployeeServiceInterface {


public EmployeeEntity addEmployeeEntity(EmployeeEntity employee);

public  List<EmployeeEntity> getAllEmployees();

public  EmployeeEntity getEmpById(Long empidL);

public void deleteEmpid(Long empid);

}
