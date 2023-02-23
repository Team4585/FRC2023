package frc.robot.Sussystems;

import frc.robot.huskylib.src.RoboDevice;
// import com.revrobotics.*;
// import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Claw extends RoboDevice{

// private BasicPID left_motor;
// private BasicPID right_motor;
// private CANSparkMax intakeMotor;

private double targPosition = 2.0;
private double intakeSpeed = 0.0;

private static double positionThreshold = 0.05;

  public Claw(){
    super("Claw Sub System");
    //Comments are from wallE class from last year
    // left_motor = new BasicPID(WiringConnections.LEFT_WALLE_CONTROLLER_ID);
    // right_motor = new BasicPID(WiringConnections.RIGHT_WALLE_CONTROLLER_ID);
  
    // left_motor.setSlave(right_motor);

    // intakeMotor = new CANSparkMax(WiringConnections.INTAKE_CONTROLLER_ID, MotorType.kBrushless);
  }

  public void Initialize(){

  }

  public void openClaw(){
    //Update the double for specific values
    //left_motor.setRotations(targPosition);
    System.out.println("Opening the claw");
  }


  //because of the direction the motor was installed, we have to invert its values to go "forward"
  public void clampCone(){
    // setIntakeSpeed(-0.6);
    // intakeMotor.set(intakeSpeed);
    System.out.println("Clamping Cone");
  }

  public void clampCube(){
    // setIntakeSpeed(0.0);
    // intakeMotor.set(intakeSpeed);
    System.out.println("Clamping Cube");
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

  public void setIntakeSpeed(double speed){
    intakeSpeed = speed;
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

