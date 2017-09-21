package org.usfirst.frc.team4585.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

	int driveLPort = 0;
	int driveRPort = 1;
	int cannonTriggerPort = 0;
	int climbPort = 2;

	int joystickPort = 0;

	int climbButton = 2;
	int climbInvertButton = 11;
	int fireButton = 1;
	int fireSafetyButton = 3;

	TankDrive chassis = new TankDrive(driveLPort, driveRPort);
	Extreme3DPro joy = new Extreme3DPro(joystickPort);
	Launcher gun = new Launcher(cannonTriggerPort);
	Climber climber = new Climber(climbPort);

	public Robot() {

	}

	@Override
	public void teleopPeriodic() {
		chassis.arcadeDrive(-joy.getZ(), joy.getY());
		
		gun.setFiring((int)(joy.getButton(fireButton)*joy.getButton(fireSafetyButton)));
		climber.setClimbing(joy.getButton(climbButton) * joy.getThrottle());
	}

}
