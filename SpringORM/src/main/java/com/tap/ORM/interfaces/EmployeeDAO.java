package com.tap.ORM.interfaces;

import java.util.ArrayList;

import com.tap.ORM.entity.Employee;

public interface EmployeeDAO {
    void insertEmployee(Employee e);
    ArrayList<Employee>fetchAll();
    Employee fetchSpecific(int id);
}
