package frc.robot;

public class FRC2023TeleopDecisionMaker {
  private FRC2023Joystick m_TheJoystick = new FRC2023Joystick();
  private WeaponsJoystick m_TheWeaponsJoystick = new WeaponsJoystick();

  
  private FRC2023Chassis m_Chassis = new FRC2023Chassis();
  private PneumaticsCompressor m_TheCompressor = new PneumaticsCompressor();
  private ShifterControl m_TheShifter = new ShifterControl();
  private HandControl m_TheHand = new HandControl();
  private ChassisEncoders m_ChassisEncoders = new ChassisEncoders();
  private Gyro m_TheGyro = new Gyro();
  private Arm m_Arm = new Arm();



  FRC2023TeleopDecisionMaker(){

  }

  public void initialize(){
    System.out.println("Initializing...");
  }

  public void doDecisions(){

    // System.out.println("-- F/B: " + m_TheJoystick.getForwardBackwardValue() + 
    //                    "   S/S: " + m_TheJoystick.getSideToSideValue() + 
    //                    "   Rot: " + m_TheJoystick.getTwistValue());

      m_Chassis.setTargForwardBack(m_TheJoystick.getForwardBackwardValue());
      m_Chassis.setTargRotation(m_TheJoystick.getTwistValue());

      if (m_TheJoystick.triggerReleaseEvent()){
        m_TheShifter.toggleGear();
        //m_TheCompressor.enableAfterShift();
      }

      //System.out.println(m_TheWeaponsJoystick.getForwardBackwardValue());
      m_Arm.moveArm(-m_TheWeaponsJoystick.getForwardBackwardValue());
  
      if (m_TheJoystick.button5ReleaseEvent()){
        m_TheCompressor.toggleCompressor();
      }

      if (m_TheWeaponsJoystick.triggerReleaseEvent()){
        m_TheHand.toggleHand();
      }

      if (m_TheWeaponsJoystick.button5Pushed()) {
        //m_Arm.lowDrop();
      }

      if (m_TheWeaponsJoystick.button3Pushed()) {
        //m_Arm.mediumDrop();
      }
      
      if(m_TheWeaponsJoystick.button5ReleaseEvent()|| m_TheJoystick.button3ReleaseEvent()){
        //m_Arm.pickUp();
      }

      //System.out.println(m_ChassisEncoders.GetLeftDegreesEncoderValue());
     // System.out.println(m_TheGyro.getHeading());
    }
  

  public void setChassis(FRC2023Chassis TheChassis){
    m_Chassis = TheChassis;
  }


}
