package org.usfirst.frc.team9300.robot.subsystems;

import org.usfirst.frc.team9300.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem {
	private VictorSP m1;
	private VictorSP m2;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public Lifter() {
		m1 = new VictorSP(RobotMap.LIFTER_MOTOR_1);
		m2 = new VictorSP(RobotMap.LIFTER_MOTOR_2);
		m1.setInverted(RobotMap.LIFTER_INVERTED);
		m2.setInverted(RobotMap.LIFTER_INVERTED);
	}
	
	public void move(double pwr) {
		m1.set(pwr);
		m2.set(pwr);
	}
	
	public void stop() {
		m1.stopMotor();
		m2.stopMotor();
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
}

