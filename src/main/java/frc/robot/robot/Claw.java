package frc.robot;

import com.revrobotics.CANSparkMax;

import frc.robot.huskylib.src.RoboDevice;


public class Claw extends RoboDevice{
  private BasicPID m_ClawMotor;

  private int closeCube = 10;
  private int closeCone = 15;
  private int open = 0;
  
  
  public Claw(){
    super("Claw Sub System");
    
    m_ClawMotor = new BasicPID(WiringConnections.claw);
  }
  
  public void Initialize(){

  }

  public void closeCube(){
    m_ClawMotor.setRotations(closeCube);
  }

  public void closeCone(){
    m_ClawMotor.setRotations(closeCone);
  }

  public void open(){
    m_ClawMotor.setRotations(open);
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
