package frc.robot;

public class Claw_testTeleopDecisionMaker {
  private Claw_testJoystick m_TheJoystick = new Claw_testJoystick(0);

  private Claw m_Claw;



  Claw_testTeleopDecisionMaker(){

  }

  public void initialize(){
  }

  public void doDecisions(){

    // System.out.println("-- F/B: " + m_TheJoystick.getForwardBackwardValue() + 
    //                    "   S/S: " + m_TheJoystick.getSideToSideValue() + 
    //                    "   Rot: " + m_TheJoystick.getTwistValue());

    if(m_TheJoystick.Button6Pressed()){
      m_Claw.closeCone();
    }

    if(m_TheJoystick.Button4Pressed()){
      m_Claw.closeCube();
    }

    if(m_TheJoystick.Button4Released() || 
    m_TheJoystick.Button6Released()){
      m_Claw.open();
    }

  }

  public void setClawSubSystem(Claw ClawSys){
    m_Claw = ClawSys;
  }


}
