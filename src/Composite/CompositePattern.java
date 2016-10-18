/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author aashgar
 */
public class CompositePattern {
    public static void main(String[] args) {
        Employee manager = new Employee("A", "IT", 10000);
        
        Employee subManager1 = new Employee("B", "IT", 6500);
        Employee subManager2 = new Employee("C", "IT", 6500);
        
        Employee salah = new Employee("D", "IT", 3);
        Employee emp2 = new Employee("E", "IT", 3000);
        Employee emp3 = new Employee("F", "IT", 3001);
        
        System.out.println(manager.toString());
        manager.add(subManager1);
        manager.add(subManager2);
        
        subManager1.add(salah);
        
        subManager2.add(emp2);
        subManager2.add(emp3);
        
        for(Employee e: manager.getEmployees()){
            System.out.println(e.toString());
        }
        System.out.println(salah.toString());
        for(Employee e: subManager2.getEmployees()){
            System.out.println(e.toString());
        }
    }
    
}
