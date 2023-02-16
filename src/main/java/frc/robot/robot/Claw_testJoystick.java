package frc.robot;

import frc.robot.huskylib.devices.HuskyJoystick;

public class Claw_testJoystick extends HuskyJoystick{
  public Claw_testJoystick(int port) {
    super(0);
  }

  private static final int WEAPONS_JOYSTICK_PORT = 1;
 
  private static final int TRIGGER_BUTTON = 0;
  private static final int BUTTON_2 = 1;
  private static final int BUTTON_3 = 2;
  private static final int BUTTON_4 = 3;
  private static final int BUTTON_5 = 4;
  private static final int BUTTON_6 = 5;

  public boolean Button6Pressed(){
    return isButtonPushed(BUTTON_6);
  }

  public boolean Button6Released(){
    return buttonReleaseEvent(BUTTON_6);
  }

  public boolean Button4Pressed(){
    return isButtonPushed(BUTTON_4);
  }

  public boolean Button4Released(){
    return buttonReleaseEvent(BUTTON_4);
  }
}
