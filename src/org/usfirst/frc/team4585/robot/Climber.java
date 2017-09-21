package org.usfirst.frc.team4585.robot;

import edu.wpi.first.wpilibj.Spark;

public class Climber {

	double speedCoeff = -1;
	Spark motor;

	public Climber(int port) {
		motor = new Spark(port);
	}

	public void setClimbing(double speed) {
		motor.set(speed*speedCoeff);

	}

	public double getSpeedCoeff() {
		return this.speedCoeff;
	}

}
