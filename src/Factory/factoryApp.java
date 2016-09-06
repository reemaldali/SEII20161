/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author aashgar
 */
public class factoryApp {
    public static void main(String[] args) {
        Stundet s1 = factoryDP.getStudent("it");
        s1.view();
        
        s1 = factoryDP.getStudent("art");
        s1.view();
    }
    
}
