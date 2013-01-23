package edu.wpi.first.wpilibj.templates;

public interface Event {
    public void doIt(int eventRegistrar);
    
    Event next = null;
}