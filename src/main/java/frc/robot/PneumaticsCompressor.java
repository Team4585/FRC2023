package frc.robot;

import com.revrobotics.AnalogInput;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.huskylib.src.RoboDevice;

public class PneumaticsCompressor extends RoboDevice{
  private final int LOW_PRESSURE_THRESHOLD = 45;
  private final int HIGH_PRESSURE_THRESHOLD = 50;

  private boolean compShouldBeOn;

  Compressor shifterCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
  private Timer m_Timer = new Timer();

  public void enableAfterShift(){
    shifterCompressor.enableDigital();
    System.out.println("Compressor on");

    m_Timer.reset();
    m_Timer.start();

    if (m_Timer.hasElapsed(1.5)){
      shifterCompressor.disable();
      System.out.println("Compressor off");
    }
  }

  public void toggleCompressor(){

    if (shifterCompressor.enabled() == false){
      //shifterPCM.enableCompressorAnalog(LOW_PRESSURE_THRESHOLD, HIGH_PRESSURE_THRESHOLD);
      shifterCompressor.enableDigital();
    }
    else{
      shifterCompressor.disable();
    }
  }


    public PneumaticsCompressor(){
        super("PneumaticsCompressor Sub System");
    
      }
    
      public void Initialize(){
    
      }
    
      @Override
      public void doGatherInfo() {
        super.doGatherInfo();

        System.out.println(shifterCompressor.getPressureSwitchValue());
      }
    
      @Override
      public void doActions() {
        super.doActions();
      }
}