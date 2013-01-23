
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.CANJaguar;
//import edu.wpi.first.wpilibj.Jaguar;


public class CANJagEvent implements Event {
    CANJaguar jag;
    public CANJagEvent(int jagnumber){
        try{
            jag = new CANJaguar(jagnumber);
        }catch(Exception e){
            System.out.println("not init " + e);
        }
        
        System.out.println("Made it to the event");
    }
    public void doIt (int l){
        if (l == 0){
           try{
            jag.setX(.5);
        }catch(Exception e){
            System.out.println("timeout: " + e);
        }
        }
        else if(l == 1){
            try{
            jag.setX(0);
        }catch(Exception e){
            System.out.println("timeout: " + e);
            
             }
        }
    
    
    }
}
    

