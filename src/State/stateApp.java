/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author aashgar
 */
public class stateApp {
    public static void main(String[] args) {
        Context aContext = new Context();
        Open anOpen = new Open();
        anOpen.doAction(aContext);
        System.out.println(aContext.getState().toString());
        
        Closed aClosed = new Closed();
        aClosed.doAction(aContext);
        System.out.println(aContext.getState().toString());
    }
    
}
