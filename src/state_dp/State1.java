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
public class State1 implements State{

    @Override
    public void doAction(Context con) {
        System.out.println("This is State1 !");
        con.setState(this);
    }
    
    public String toString()
    {
        return "State1 !";
    }
    
}
