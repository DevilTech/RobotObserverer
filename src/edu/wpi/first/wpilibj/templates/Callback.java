
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;

public class Callback {
        Event[] eventArray = new Event[10];
        static Callback instance;
        
        //boolean buttonAstate = false;
        
        
                
    public int subscribe(Event latestEvent, int eventIndex) {
        eventArray[eventIndex] = latestEvent;
        return 0;
    }
    public static Callback getInstance(){
        if(instance == null){
            instance = new Callback();
        }
        return instance;
    }
    public void poll(Joystick joystick) {
        boolean bail = false;
        JoyButton joy = new JoyButton(joystick);
        
        
        
        while(!bail) {
            if(joy.isNewPress(joy.a)){
                
                
                    System.out.println("button found");
                    if (eventArray[1] != null){
                        eventArray[1].doIt(0);
                }else{
                        System.out.println("Not created");
                    }         
            
           
            }else if(joy.isNewOff(joy.a)){
                if (eventArray[1] != null){
                     eventArray[1].doIt(1);
            }if(joy.isNewPress(joy.b)) {
                System.out.println("button found");
                    if (eventArray[1] != null){
                        eventArray[1].doIt(1);
                }else{
                        System.out.println("Not created");
                    }         
            
           
            }else if(joy.isNewOff(joy.b)){
                if (eventArray[1] != null){
                     eventArray[1].doIt(0);
                    }
            }if(joy.isNewPress(joy.x)) {
                System.out.println("button found");
                    if (eventArray[2] != null){
                        eventArray[2].doIt(1);
                    }else{
                        System.out.println("Not created");
                    }
            }else if(joy.isNewOff(joy.x)){
                System.out.println("button found");
                    if (eventArray[2] != null){
                        eventArray[2].doIt(0);
                    }else{
                        System.out.println("Not created");
                    }
            }if(joy.isNewPress(joy.y)) {
                System.out.println("button found");
                    if (eventArray[2] != null){
                        eventArray[2].doIt(-1);
                    }else{
                        System.out.println("Not created");
                    }
            }else if(joy.isNewOff(joy.y)){
                System.out.println("button found");
                    if (eventArray[2] != null){
                        eventArray[2].doIt(0);
                    }else{
                        System.out.println("Not created");
                    }
            }
        }
        }
    }
    
    

    
    public void call (int i){
        
    }

}
