
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;


public class Poller extends Thread{
   
    Callback call;
    Joystick joy;
    
    public Poller(Joystick joy, Callback call){
        
        this.joy = joy;
        this.call = call;
        
    }
    
    public void run(){
        call.poll(joy);
        System.out.println("Thread");
    }
}
