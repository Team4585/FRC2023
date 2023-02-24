package frc.robot.Autonomous;

import edu.wpi.first.wpilibj.interfaces.Gyro;
import frc.robot.WiringConnections;
import frc.robot.Sussystems.ChassisEncoders;
import frc.robot.huskylib.src.BasicPID;
import frc.robot.huskylib.src.RoboDevice;
import frc.robot.huskylib.src.WestCoastDriveTrain;

public class ChassisAutonomousCommandLibrary extends RoboDevice{
    private frc.robot.Sussystems.Gyro m_TheGyro = new frc.robot.Sussystems.Gyro();
    private ChassisEncoders m_TheChassisEncoders = new ChassisEncoders();
    //private BasicPID m_BasicPID = new BasicPID();
    private WestCoastDriveTrain m_TheDriveTrain = new WestCoastDriveTrain(
        WiringConnections.LEFT_MASTER_CONTROLLER_ID,
        WiringConnections.LEFT_SLAVE_1_CONTROLLER_ID,
        WiringConnections.LEFT_SLAVE_2_CONTROLLER_ID,
        WiringConnections.RIGHT_MASTER_CONTROLLER_ID,
        WiringConnections.RIGHT_SLAVE_1_CONTROLLER_ID,
        WiringConnections.RIGHT_SLAVE_2_CONTROLLER_ID);
    
    private double robotHeading;
    private double leftSideWheelRotation;
    private double rightSideWheelRotation;

    public ChassisAutonomousCommandLibrary(){
        super("Chassis Autonomous Command Library");
    }


    public void Initialize(){
    }



    public void turnToHeading(double targetHeading){
        /*
        m_BasicPID.setTarget(targetHeading);
        m_BasicPID.setPosition(robotHeading);
        m_BasicPID.setMaxOutput(100);
        m_BasicPID.setMinOutput(-100);
        m_BasicPID.setPosition(m_TheGyro.getHeading());
        m_BasicPID.setP(16);
        m_BasicPID.setI(8);
        m_BasicPID.setD(0.2);

        System.out.println(m_BasicPID.calculateError());

        m_TheDriveTrain.setTargRotationSpeed(m_BasicPID.calculateError());
        */
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
