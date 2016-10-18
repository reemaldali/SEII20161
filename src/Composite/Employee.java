/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aashgar
 */
public class Employee {
    private String name;
    private String department;
    private int salary;
    private List<Employee> subOrdenates;
    
    public Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
        subOrdenates = new ArrayList<Employee>();
    }
    
    public void add(Employee emp){
        this.subOrdenates.add(emp);
    }
    
    public void remove(Employee emp){
        if(subOrdenates.size() != 0)
            this.subOrdenates.remove(emp);
    }
    
    public List<Employee> getEmployees(){
        return this.subOrdenates;
    }
    
    @Override
    public String toString(){
        return "Employee Name: " + this.name + " Department: " + this.department + " Salary: " + this.salary;
    }
}