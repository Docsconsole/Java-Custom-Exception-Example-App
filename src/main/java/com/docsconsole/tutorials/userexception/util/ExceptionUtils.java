package com.docsconsole.tutorials.userexception.util;

import com.docsconsole.tutorials.userexception.exception.DepartmentNotFoundException;
import com.docsconsole.tutorials.userexception.exception.EmployeeNotFoundException;
import com.docsconsole.tutorials.userexception.model.Department;
import com.docsconsole.tutorials.userexception.model.Employee;

public class ExceptionUtils {
    public Employee getEmployee(Integer id) throws EmployeeNotFoundException {
        if(id != null){
            return new Employee();
        }
        throw new EmployeeNotFoundException("Employee is not existed with given id.");

    }
    public Department getDepartment(Integer id) throws DepartmentNotFoundException {
        if(id != null){
            return new Department();
        }
        throw new DepartmentNotFoundException();

    }
}
