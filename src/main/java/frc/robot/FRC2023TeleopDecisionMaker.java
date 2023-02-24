package frc.robot;

import frc.robot.Sussystems.ChassisEncoders;
import frc.robot.Sussystems.Gyro;
import frc.robot.Sussystems.PneumaticsCompressor;
import frc.robot.Sussystems.ShifterControl;

public class FRC2023TeleopDecisionMaker {
  private FRC2023Joystick m_TheJoystick = new FRC2023Joystick();

  
  private FRC2023Chassis m_Chassis = new FRC2023Chassis();
  private PneumaticsCompressor m_TheCompressor = new PneumaticsCompressor();
  private ShifterControl m_TheShifter = new ShifterControl();
  private ChassisEncoders m_ChassisEncoders = new ChassisEncoders();
  private Gyro m_TheGyro = new Gyro();



  FRC2023TeleopDecisionMaker(){

  }
  //Lets see if it blows up

  public void initialize(){
  }

  public void doDecisions(){

    // System.out.println("-- F/B: " + m_TheJoystick.getForwardBackwardValue() + 
    //                    "   S/S: " + m_TheJoystick.getSideToSideValue() + 
    //                    "   Rot: " + m_TheJoystick.getTwistValue());

      m_Chassis.setTargForwardBack(m_TheJoystick.getForwardBackwardValue());
      m_Chassis.setTargRotation(m_TheJoystick.getTwistValue());

      if (m_TheJoystick.triggerReleaseEvent()){
        m_TheShifter.toggleGear();
        m_TheCompressor.enableAfterShift();
      }
  
      if (m_TheJoystick.button5ReleaseEvent()){
        //m_TheCompressor.toggleCompressor();
        m_TheCompressor.toggleCompressor();
      }

      //System.out.println(m_ChassisEncoders.GetLeftDegreesEncoderValue());
      System.out.println(m_TheGyro.getHeading());
    }
  

  public void setChassis(FRC2023Chassis TheChassis){
    m_Chassis = TheChassis;
  }


}
