package frc.robot;

import com.revrobotics.CANSparkMax;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.huskylib.src.RoboDevice;

public class Arm extends RoboDevice {
    
    private int pickUp = 0;
    private int low = 50;
    private int medium = 90;
    
    private BasicPID m_leftMasterController;
    //private BasicPID m_leftSlave1Controller;
    private BasicPID m_leftSlave2Controller;
    
    
    public Arm(){
        super("Arm Sub System");
    
        m_leftMasterController = new BasicPID(WiringConnections.ARM_MASTER_CONTROLLER_ID);
        //m_leftSlave1Controller = new BasicPID(WiringConnections.ARM_SLAVE_1_CONTROLLER_ID);
        m_leftSlave2Controller = new BasicPID(WiringConnections.ARM_SLAVE_2_CONTROLLER_ID);

        //m_leftSlave1Controller.setSlave(m_leftMasterController);
        m_leftSlave2Controller.setSlave(m_leftMasterController);
      }
    
      public void Initialize(){
    
      }


      public void pickUp(){
        m_leftMasterController.setRotations(pickUp);
      }

      public void lowDrop(){
          m_leftMasterController.setRotations(low);
      }

      public void mediumDrop(){
        m_leftMasterController.setRotations(medium);
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
