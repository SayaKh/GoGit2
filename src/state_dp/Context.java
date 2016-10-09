/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_dp;

/**
 *
 * @author Ghada
 */
class Context {
    private State state;
    
    public Context()
    {
        state = null;
    }
    public void setState(State stat)
    {
        this.state=stat;
    }
    
    public State getState()
    {
        return state;
    }
    
}
