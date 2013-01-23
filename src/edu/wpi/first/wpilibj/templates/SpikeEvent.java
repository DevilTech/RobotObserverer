
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Relay;


public class SpikeEvent implements Event{
    Relay spike;
    public SpikeEvent(int spikenum, int eventnum){
         spike = new Relay(spikenum);
    
            Callback.getInstance().subscribe(this, eventnum);
        }
    public void doIt(int l){
        if (l == 0){
        spike.set(Relay.Value.kForward);
        System.out.println("moving elevator");
        
        }
        else if (l == 1){
        spike.set(Relay.Value.kOff);
        System.out.println("moving elevator");
        
        }else if (l == -1){
        spike.set(Relay.Value.kReverse);
        System.out.println("moving elevator");
        }
    }
}
