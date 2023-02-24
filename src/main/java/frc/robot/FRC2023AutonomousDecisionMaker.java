package frc.robot;

import java.util.List;

import frc.robot.Autonomous.AutoTaskStartSequence;
import frc.robot.Autonomous.AutoTaskTurn90Deg;
import frc.robot.Autonomous.AutonomousTaskBase;
import frc.robot.Autonomous.AutonomousTaskDisbatcher;
import frc.robot.Autonomous.ChassisAutonomousCommandLibrary;

public class FRC2023AutonomousDecisionMaker {

  private FRC2023Chassis m_Chassis;

  private ChassisAutonomousCommandLibrary m_AutonomousCommandLibrary = new ChassisAutonomousCommandLibrary();

  private List<AutonomousTaskBase> m_TaskList;
  private AutonomousTaskDisbatcher m_autonomousTaskDisbatcher;

  private AutoTaskStartSequence autoStartSeq = new AutoTaskStartSequence();
  private AutoTaskTurn90Deg autoTurn90Deg = new AutoTaskTurn90Deg(m_AutonomousCommandLibrary);

  //Lets see if it blows up

  FRC2023AutonomousDecisionMaker(){
    m_TaskList = List.of(
      autoStartSeq,
      autoTurn90Deg
    );
  }

  public void initialize(){
    m_autonomousTaskDisbatcher.resetAuto();
  }

  public void doDecisions(){
    m_autonomousTaskDisbatcher.RunAutoTask();
  }

  public void setChassis(FRC2023Chassis TheChassis){
    m_Chassis = TheChassis;
    autoTurn90Deg.TaskInitialize();
  }


}
