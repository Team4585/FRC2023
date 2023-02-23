package frc.robot.Sussystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.huskylib.src.RoboDevice;

public class ShifterControl extends RoboDevice{
    Solenoid ShifterSolenoid = new Solenoid(0, PneumaticsModuleType.CTREPCM, 0);


    //Decompressed is high gear
    public void toggleGear(){
      System.out.println("The shifter is " + ShifterSolenoid.get());
      ShifterSolenoid.set(!ShifterSolenoid.get());
    }

    public void shiftHighGear(){
      ShifterSolenoid.set(true);
    }

    public void shiftLowGear(){
      ShifterSolenoid.set(false);
    }


    public ShifterControl(){
        super("Shifter Sub System");
    
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