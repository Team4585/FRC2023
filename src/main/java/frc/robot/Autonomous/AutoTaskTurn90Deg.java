package frc.robot.Autonomous;

public class AutoTaskTurn90Deg extends AutonomousTaskBase{
    private ChassisAutonomousCommandLibrary m_AutoCommandLibrary;


    public AutoTaskTurn90Deg(ChassisAutonomousCommandLibrary autoCommandLibrary){
        m_AutoCommandLibrary = autoCommandLibrary;
    }

    @Override
    public void TaskInitialize(){
        m_AutoCommandLibrary.turnToHeading(90);
    }
    //m_AutoCommandLibrary.turnToHeading(90);

    @Override
    public boolean CheckTask() {
        // TODO Auto-generated method stub
        return false;
    }
}