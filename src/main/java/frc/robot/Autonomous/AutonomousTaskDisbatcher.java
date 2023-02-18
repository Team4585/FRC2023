package frc.robot.Autonomous;

import java.util.List;
import java.util.ListIterator;

public class AutonomousTaskDisbatcher {
    private List<AutonomousTaskBase> m_AutoTaskList;
    private AutonomousTaskBase m_CurrentTask;
    private ListIterator<AutonomousTaskBase> m_TaskItr;

    public AutonomousTaskDisbatcher(List<AutonomousTaskBase> autoTaskList){
        m_AutoTaskList = autoTaskList;
        resetAuto();
    }

    public void RunAutoTask(){
        System.out.println("Run auto task");

        if (m_CurrentTask.CheckTask()){
            //Task complete, move to next one
            m_CurrentTask = m_TaskItr.next();
            m_CurrentTask.TaskInitialize();
        }
    }

    public void resetAuto(){
        System.out.println("Resetting auto");

        m_TaskItr = m_AutoTaskList.listIterator();
        m_CurrentTask = m_TaskItr.next();
        m_CurrentTask.TaskInitialize();
    }
}
