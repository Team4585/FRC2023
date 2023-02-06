package frc.robot;

public class FRC2023TeleopDecisionMaker {
  private FRC2023Joystick m_TheJoystick = new FRC2023Joystick();

  private FRC2023Chassis m_Chassis;



  FRC2023TeleopDecisionMaker(){

  }

  public void initialize(){
  }

  public void doDecisions(){

    // System.out.println("-- F/B: " + m_TheJoystick.getForwardBackwardValue() + 
    //                    "   S/S: " + m_TheJoystick.getSideToSideValue() + 
    //                    "   Rot: " + m_TheJoystick.getTwistValue());

      m_Chassis.setTargForwardBack(m_TheJoystick.getForwardBackwardValue());
      m_Chassis.setTargRotation(m_TheJoystick.getTwistValue());


  }

  public void setChassis(FRC2023Chassis TheChassis){
    m_Chassis = TheChassis;
  }


}
