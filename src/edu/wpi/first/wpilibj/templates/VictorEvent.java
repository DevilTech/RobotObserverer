package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;




public class VictorEvent implements Event{
    Victor victor;
    public VictorEvent(int num, int sub){
         victor = new Victor(num);
    
            Callback.getInstance().subscribe(this, sub);
        }
    public void doIt(int l){
        if(l == 1){
            victor.set(.5);
        }else if(l == 0){
            victor.set(0);
        }else if (l == -1){
            victor.set(-.5);
        }
        
    } 
}


