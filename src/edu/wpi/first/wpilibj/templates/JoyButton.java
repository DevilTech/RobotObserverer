
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;


public class JoyButton {
     boolean[] buttonstates = new boolean[10]; 
     final int a = 1;
     final int b = 2;
     final int x = 3;
     final int y = 4;
     final int lb = 5;
     final int rb = 6;
     final int back = 7;
     final int start = 8;
     final int lstick = 9;
     final int rstick = 10;
     
     boolean isPressed;
     Joystick joy;

    
    public JoyButton(Joystick joy){
        this.joy = joy;
        for (int i = 1; i < 10; i++ ){
            buttonstates[i-1] = false;
        }
    }
    final public boolean isNewPress(int button){
        if( joy.getRawButton(button)){
            if(buttonstates[button-1]){
               return false;
            }else{
                buttonstates[button-1] = true;
                return true;
            }
         }else{
            buttonstates[button-1] = false;
            return false;
        }
    }
    final public boolean isNewOff(int button){
        if( !joy.getRawButton(button)){
            if(!buttonstates[button-1]){
               return false;
            }else{
                buttonstates[button-1] = false;
                return true;
            }
         }else{
            buttonstates[button-1] = true;
            return false;
        }
    }
}
