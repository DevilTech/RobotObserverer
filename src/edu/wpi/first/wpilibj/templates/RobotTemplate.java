package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

public class RobotTemplate extends SimpleRobot {
    Event event1;
    Victor rightvictor;
    Victor leftvictor;
    Victor victorone;
    Joystick joystick;
    Poller poll;
    Thread watchjoystick;
    Thread drivethread;
    Jaguar jag;
    CANJagEvent jagevent;
    CANJaguar leftFront;
    CANJaguar rightFront;
    CANJaguar leftRear;
    CANJaguar rightRear;
    Drive drive;
    JoyButton butt;
    SpikeEvent gatherfront;
    SpikeEvent gatherback;
    VictorEvent elevator;
    
    
    public void robotInit(){
        try {
             elevator = new VictorEvent(2, 3);
             gatherfront = new SpikeEvent(2, 1);
             gatherback =  new SpikeEvent(3, 2);
             joystick = new Joystick(1);
             butt = new JoyButton(joystick);
             //VictorEvent victorevent = new VictorEvent(1, 1);
             poll = new Poller(joystick, Callback.getInstance());
             watchjoystick = new Thread(poll);
             drive = new Drive(joystick, this, butt);
             drivethread = new Thread(drive);
             //  Apparently in a 2 wheel drive, rear stands for the 2 wheels
             System.out.println("init");
             
             
             
        } catch (Exception ex) {
            
            System.out.println("did not init");
        }
        
    
    }
    public void autonomous() {
        
    }
    public void operatorControl() {
        drivethread.start();
        System.out.println("in operator");
        while(isEnabled()){
            
        }
    }
}
