package frc.robot;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.huskylib.src.RoboDevice;

public class HandControl extends RoboDevice{
    Solenoid handSolenoid = new Solenoid(0, PneumaticsModuleType.CTREPCM, 1);


    
    public void toggleHand(){
      System.out.println("The shifter is " + handSolenoid.get());
      handSolenoid.set(!handSolenoid.get());
    }


    public HandControl(){
        super("Hand Sub System");
    
      }
    
      public void Initialize(){
    
      }
    
      @Override
      public void doGatherInfo() {
        super.doGatherInfo();
    
      }
    
      @Override
      public void doActions() {
        super.doActions();
      }
}