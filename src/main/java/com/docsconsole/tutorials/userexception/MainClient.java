package com.docsconsole.tutorials.userexception;

import com.docsconsole.tutorials.userexception.exception.DepartmentNotFoundException;
import com.docsconsole.tutorials.userexception.util.ExceptionUtils;

public class MainClient {
    public static void main(String[] args) {

        /*try {
            new Utils().getEmployee(null);
        }
        catch (EmployeeNotFoundException ex) {
            System.out.println("Exception in catch block");
            System.out.println(ex.getMessage());
        }*/

        try {
            new ExceptionUtils().getDepartment(null);
        }
        catch (DepartmentNotFoundException ex) {
            System.out.println("Exception in catch block");
            System.out.println(ex.getMessage());
        }
    }
}
