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
public class Open implements State{

    @Override
    public void doAction(Context aContext) {
        System.out.println("Open State ...");
        aContext.setState(this);
        }
    public String toString(){
        return "This object in open state";
    }
    
}
