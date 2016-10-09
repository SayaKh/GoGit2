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
public class Main {
    
    public static void main (String args [])
    {
        //object from Context class can take more than one state or behavior at the runtime
        Context cont = new Context();
        
        State1 s1 = new State1();
        s1.doAction(cont);
        System.out.println(cont.getState().toString());
        
        State2 s2= new State2();
        s2.doAction(cont);
        System.out.println(cont.getState().toString());
        
    }
    
}
