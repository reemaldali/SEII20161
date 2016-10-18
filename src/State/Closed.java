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
public class Closed implements State{
    @Override
    public void doAction(Context aContext) {
        System.out.println("Closed State ...");
        aContext.setState(this);
        }
    public String toString(){
        return "This object in closed state";
    }
}
