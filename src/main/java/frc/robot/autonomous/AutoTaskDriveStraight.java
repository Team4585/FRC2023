package frc.robot.autonomous;

import frc.robot.FRC2023Chassis;
import edu.wpi.first.wpilibj.Timer;

public class AutoTaskDriveStraight extends AutonomousTaskBase{
    private FRC2023Chassis m_chassis;
    private Timer m_timer = new Timer();

    public AutoTaskDriveStraight(){
    }

    public void setChassis(FRC2023Chassis chassis){
        m_chassis = chassis;
    }

    @Override
    public void TaskInitialize() {
        // TODO Auto-generated method stub
        m_chassis.driveStraight();
        m_timer.start();
    }

    @Override
    public boolean CheckTask() {
        if(m_chassis == null){
            System.out.println("Chassis is null!");
        }
        else{
            System.out.println("Chassis is valid");
        }


        if(m_timer.hasElapsed(2.25)){
            m_chassis.setTargForwardBack(0.0);
            return true;
        } else{
            return false;
        }
    }
}