package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;



public class Drive extends Thread{
    RobotDrive drive;
    Joystick joystick;
    CANJaguar fl;
    CANJaguar fr;
    CANJaguar bl;
    CANJaguar br;
    double time = 1.0/16;
    RobotTemplate robot;
    JoyButton butt;
    
    
    
    
    public Drive(Joystick joy, RobotTemplate robo, JoyButton but){
        joystick = joy;
        robot = robo;
        butt = but;
        try{
            fl = new CANJaguar(4);
            fr = new CANJaguar(3);
            bl = new CANJaguar(2);
            br = new CANJaguar(5);
        }catch(Exception e){
            System.out.println("no inits");
        }
        drive = new RobotDrive(fl, bl, fr, br);
        drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    }

    
    public void run(){
        while(robot.isEnabled()){
            if(butt.isNewPress(butt.lb)){
                drive.arcadeDrive(0,-.5);
                Timer.delay(time);
                drive.arcadeDrive(0,0);
            }
            else if(butt.isNewPress(butt.rb)){
                drive.arcadeDrive(0,.5);
                Timer.delay(time);
                drive.arcadeDrive(0,0);
            } 
            drive.arcadeDrive(joystick.getZ(), joystick.getX());
        }
    }
    
            
}
