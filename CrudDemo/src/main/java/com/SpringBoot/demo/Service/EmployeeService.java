package com.SpringBoot.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.demo.entity.EmployeeEntity;
import com.SpringBoot.demo.repo.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface {

@Autowired
private EmployeeRepo eRepo;


@Override
public EmployeeEntity addEmployeeEntity(EmployeeEntity employee) {
	EmployeeEntity savedEmployeeEntity = eRepo.save(employee);
 return savedEmployeeEntity;
}
@Override
public List<EmployeeEntity> getAllEmployees(){
	 return eRepo.findAll();
	
}
@Override
public  EmployeeEntity getEmpById(Long empid) {
	 return eRepo.findById(empid).get();
	
}
@Override
public void  deleteEmpid(Long empid) {
	  eRepo.deleteById(empid);
	
}
}
	
	
	
	
	
	
	
	
	
	

