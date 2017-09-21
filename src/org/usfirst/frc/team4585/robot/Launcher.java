package org.usfirst.frc.team4585.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;

public class Launcher {

	int fireValvePort;
	int magazineSolenoidPort;

	Solenoid fireValve;
	Solenoid magazineSolenoid;

	public Launcher(int cannonTriggerPort) {
		this.fireValvePort = cannonTriggerPort;

		fireValve = new Solenoid(fireValvePort);
	}

	public void setFiring(int state) {
		fireValve.set(state == 1 ? true : false);

	}

}
