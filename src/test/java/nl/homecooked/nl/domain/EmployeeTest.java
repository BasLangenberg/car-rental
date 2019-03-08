package nl.homecooked.nl.domain;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    void Employee_ClassExists(){
        Employee emp = new Employee("John Johnson");
    }

    @Test
    void Employee_HasName(){
        Employee emp = new Employee("John Johnson");
        emp.getName().equals("John Johnson");
    }

}
