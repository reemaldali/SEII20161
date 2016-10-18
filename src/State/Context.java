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
public class Context {
    private State aState;
    public Context(){
        this.aState = null;
    }
    public void setState(State aState){
        this.aState = aState;
    }
    public State getState(){
        return this.aState;
    }
    
}
