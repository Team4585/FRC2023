package frc.robot.Autonomous;

import edu.wpi.first.wpilibj.interfaces.Gyro;
import frc.robot.ChassisEncoders;
import frc.robot.huskylib.src.RoboDevice;

public class ChassisAutonomousCommandLibrary extends RoboDevice{
    private frc.robot.Gyro m_TheGyro = new frc.robot.Gyro();
    private ChassisEncoders m_TheChassisEncoders = new ChassisEncoders();
    
    private double robotHeading;
    private double leftSideWheelRotation;
    private double rightSideWheelRotation;

    public ChassisAutonomousCommandLibrary(){
        super("Chassis Autonomous Command Library");
    }


    public void Initialize(){
        
    }

    @Override
    public void doGatherInfo(){
        robotHeading = m_TheGyro.getHeading();

        leftSideWheelRotation = m_TheChassisEncoders.GetLeftDegreesEncoderValue();
        rightSideWheelRotation = m_TheChassisEncoders.GetRightDegreesEncoderValue();
    }

    @Override
    public void doActions() {
        super.doActions();
    }
}
