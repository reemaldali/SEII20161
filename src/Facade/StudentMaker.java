/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aashgar
 */
public class StudentMaker {
    private static StudentMaker aMaker;
    private Student itStudent;
    private Student engStudent;
    private StudentMaker(){
        this.itStudent = new ITStudent();
        this.engStudent = new ENGStudent();
    }
    public static StudentMaker getMaker(){
        if(aMaker == null)
            aMaker = new StudentMaker();
        return aMaker;
    }
    public void viewIT(){
        this.itStudent.show();
    }
    public void viewENG(){
        this.engStudent.show();
    }
    
}
