package com.github.circuitrunners.akilib;

public abstract class Module {

  public void robotInit() {}

  public void disabledInit() {}

  public void disabledPeriodic() {}

  public void autonomousInit() {}

  public void autonomousPeriodic() {}

  public void teleopInit() {}

  public void teleopPeriodic() {}

  public void testPeriodic() {}
}