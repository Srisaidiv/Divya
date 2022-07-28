package com.SpringBoot.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.demo.Service.EmployeeServiceInterface;
import com.SpringBoot.demo.entity.EmployeeEntity;

@RestController
@RequestMapping("/code")
public class EmployeeController {
	@Autowired
    private EmployeeServiceInterface empSerIn;
    @PostMapping("/save")
    public ResponseEntity<EmployeeEntity> addEmployeeEntity(@RequestBody EmployeeEntity  employee)
    {
    EmployeeEntity employeeSaved=empSerIn.addEmployeeEntity(employee);
    return new ResponseEntity<EmployeeEntity>(employeeSaved,HttpStatus.CREATED);
    }
    @GetMapping("/all")
public ResponseEntity<List<EmployeeEntity>>getAllEmployees()
{
 	List<EmployeeEntity>listOfAllEmp = empSerIn.getAllEmployees();
    return new ResponseEntity<List<EmployeeEntity>>(listOfAllEmp,HttpStatus.OK);

    }
    @GetMapping("/emp/{empid}")
    public ResponseEntity<EmployeeEntity>getEmpid(@PathVariable("empid") Long empid)
    {
     	EmployeeEntity EmpRetrived = empSerIn.getEmpById(empid);
        return new ResponseEntity<EmployeeEntity>(EmpRetrived,HttpStatus.OK);

        }


    @DeleteMapping("/delete/{empid}")
    public ResponseEntity<Void>deleteEmpid(@PathVariable("empid") Long empid)
    {
     	 empSerIn.deleteEmpid(empid);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);

        }


    @PutMapping("/update")
    public ResponseEntity<EmployeeEntity> updateEmployeeEntity(@RequestBody EmployeeEntity  employee)
    {
    EmployeeEntity employeeSaved=empSerIn.addEmployeeEntity(employee);
    return new ResponseEntity<EmployeeEntity>(employeeSaved,HttpStatus.CREATED);
    }
        }


