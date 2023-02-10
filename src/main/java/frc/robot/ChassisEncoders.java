package frc.robot;

import edu.wpi.first.wpilibj.Encoder;
import frc.robot.huskylib.src.RoboDevice;


public class ChassisEncoders extends RoboDevice{
  Encoder m_LeftEncoder = new Encoder(2, 3);
  Encoder m_RightEncoder = new Encoder(0, 1);

  public double GetLeftRawEncoderValue(){
    return m_LeftEncoder.getDistance();
  }

  public double GetRightRawEncoderValue(){
    return m_RightEncoder.getDistance();
  }

  public double GetLeftDegreesEncoderValue(){
    return m_LeftEncoder.getDistance() * 3;
  }

  public double GetRightDegreesEncoderValue(){
    return m_RightEncoder.getDistance() * 3;
  }

  public ChassisEncoders(){
    super("Encoder Sub System");

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
