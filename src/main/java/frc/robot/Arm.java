package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Encoder;

import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.huskylib.src.RoboDevice;

public class Arm extends RoboDevice {
    
    private int pickUp = 0;
    private int low = 20;
    private int medium = 15;
    
    private CANSparkMax m_MasterController;
    private CANSparkMax m_Slave1Controller;
    private BasicPID m_Slave2Controller;

    private RelativeEncoder m_MasterEncoder;
    
    
    public Arm(){
        super("Arm Sub System");
    
        m_MasterController = new CANSparkMax(WiringConnections.ARM_MASTER_CONTROLLER_ID, MotorType.kBrushless);
        m_Slave1Controller = new CANSparkMax(WiringConnections.ARM_SLAVE_1_CONTROLLER_ID, MotorType.kBrushless);
        m_MasterEncoder = m_MasterController.getEncoder();
        //m_leftSlave2Controller = new BasicPID(WiringConnections.ARM_SLAVE_2_CONTROLLER_ID);

        //m_Slave1Controller.setSlave(m_MasterController);
        //m_leftSlave2Controller.setSlave(m_leftMasterController);
      }
    
      public void Initialize(){
    
      }

      public void moveArm(double speed){
        m_MasterController.set(speed);
        m_Slave1Controller.set(speed);
      }


      public void pickUp(){
        //m_MasterController.setRotations(pickUp);
      }

      public void lowDrop(){
          //m_MasterController.setRotations(low);
      }

      public void mediumDrop(){
        //m_MasterController.setRotations(medium);
      }
    
      @Override
      public void doGatherInfo() {
        super.doGatherInfo();
        //System.out.println(m_MasterEncoder.getPosition());
      }
    
      @Override
      public void doActions() {
        super.doActions();
      }
}
