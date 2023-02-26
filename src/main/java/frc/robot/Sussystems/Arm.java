package frc.robot.Sussystems;

import frc.robot.WiringConnections;
import frc.robot.huskylib.src.BasicPID;
import frc.robot.huskylib.src.RoboDevice;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Arm extends RoboDevice{
  WiringConnections m_TheConnections = new WiringConnections();

private BasicPID master_Motor;
private BasicPID slave_Motor_1;
private BasicPID slave_Motor_2;

private double targPosition = 2.0;
private double armSpeed = 0.0;

private static double positionThreshold = 0.05;

  public Arm(){
    super("Arm Sub System");
    //Comments are from wallE class from last year
    master_Motor = new BasicPID(WiringConnections.MASTER_ARM_CONTROLLER_ID);
    slave_Motor_1 = new BasicPID(WiringConnections.SLAVE_1_ARM_CONTROLLER_ID);
    slave_Motor_2 = new BasicPID(WiringConnections.SLAVE_2_ARM_CONTROLLER_ID);
    // right_motor = new BasicPID(WiringConnections.RIGHT_WALLE_CONTROLLER_ID);
  
    // left_motor.setSlave(right_motor);

    // intakeMotor = new CANSparkMax(WiringConnections.INTAKE_CONTROLLER_ID, MotorType.kBrushless);
  }

  public void Initialize(){

  }

  public void testArm(){
    //Update the double for specific values
    master_Motor.setRotations(targPosition + master_Motor.getPosition());
    System.out.println("Testing the arm");
  }



  public void raiseArm(){
    master_Motor.setRotations(-targPosition + master_Motor.getPosition());
  }

  // public boolean isDetracted(){
  //   if(Math.abs(left_motor.getPosition()) < positionThreshold){
  //     return true;
  //   }else{
  //     return false;
  //   }
  // }

  // public void detract(){
  //   //Update the double for specific values
  //   left_motor.setRotations(0.0);
  // }

  public void setArmSpeed(double speed){
    armSpeed = speed;
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

