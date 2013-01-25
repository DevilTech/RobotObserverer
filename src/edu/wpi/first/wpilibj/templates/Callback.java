
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;

public class Callback {
        Event[] eventArray = new Event[10];
        static Callback instance;
        final int forward = 1;
        final int backward = -1;

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
            whenPressed(joy.a, forward, 1, joy);
            whenPressed(joy.b, backward, 1, joy);
            whenPressed(joy.x, forward, 2, joy);
            whenPressed(joy.y, backward, 2, joy);
          }
     }

    public void call (int i){
        
        }
    public void whenPressed(int button, int doIt, int event, JoyButton joy){
        if(joy.isNewPress(button)) {
                //System.out.println("button found");
                    if (eventArray[2] != null){
                        eventArray[2].doIt(doIt);
                    }else{
                        //System.out.println("Not created");
                    }
            }else if(joy.isNewOff(button)){
               // System.out.println("button found");
                    if (eventArray[2] != null){
                        eventArray[2].doIt(0);
                    }else{
                      //  System.out.println("Not created");
                    }
            }
    }

}
