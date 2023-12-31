/*
Create obstacle Resistance Robot, given obstacle should be created by user.
 */
package obstacleres;
import ch.aplu.robotsim.*;

public class ObstacleRes
{
  static
  {
    RobotContext.showNavigationBar();
    RobotContext.useObstacle("sprites/bar0.gif", 250, 150);
    RobotContext.useObstacle("sprites/bar1.gif", 400, 250);
    RobotContext.useObstacle("sprites/torch.png", 250, 275);
    RobotContext.useObstacle("sprites/bar2.gif", 250, 400);
    RobotContext.useObstacle("sprites/bar3.gif", 100, 250);
  }

  public ObstacleRes()
  {
    LegoRobot robot = new LegoRobot();
    Gear gear = new Gear();
    TouchSensor ts = new TouchSensor(SensorPort.S3);
    robot.addPart(gear);
    robot.addPart(ts);
    gear.setSpeed(30);
    gear.forward();
    while (true)
    {
      if (ts.isPressed())
      {
        gear.backward(1200);
        gear.left(750);
        gear.forward();
      }
    }
  }

  public static void main(String[] args)
  {
    new ObstacleRes();
  }
}