package frc.robot;

import java.util.List;
import frc.robot.autonomous.*;

public class FRC2023AutonomousDecisionMaker {

  private FRC2023Chassis m_Chassis;
  // private WallE m_WallE;
  // private MaryPoppins m_MaryPoppins;

  private List<AutonomousTaskBase> m_TaskList;
  private AutonomousTaskDispatcher m_autoTaskDispatcher;

  //private AutoTaskDeployWallE autoDeployWallE = new AutoTaskDeployWallE(m_WallE);
  //autoDetractWallE = new AutoTaskDetractWallE(m_WallE);
  private AutoTaskStartSequence autoStartSeq = new AutoTaskStartSequence();
  private AutoTaskDriveStraight autoDriveStraight = new AutoTaskDriveStraight();

  // private AutoTaskDetractWallE autoDetractWallE;
  

 // private AutoTaskRiseMP autoRiseMP = new AutoTaskRiseMP(m_MaryPoppins);
 // private AutoTaskDropMP autoDropMP = new AutoTaskDropMP(m_MaryPoppins);

  FRC2023AutonomousDecisionMaker(){
   // m_TaskList = List.of(new AutoTaskTickCount(25), new AutoTaskHalt());
    
   System.out.println("Initializing list");
   m_TaskList = List.of(
        autoStartSeq, 
        autoDriveStraight, 
        new AutoTaskHalt()
    );

    m_autoTaskDispatcher = new AutonomousTaskDispatcher(m_TaskList);

  }

  public void initialize(){
    m_autoTaskDispatcher.resetAuto();
  }

  public void doDecisions(){
    m_autoTaskDispatcher.RunAutoTask();
    System.out.println("Entering autonomous decisions");
  }

  public void setChassis(FRC2023Chassis TheChassis){
    m_Chassis = TheChassis;
    autoDriveStraight.setChassis(TheChassis);
  }
}
