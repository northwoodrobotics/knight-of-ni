package org.usfirst.frc.team9300.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4048.swerve.drive.SwerveDrive;
import org.usfirst.frc.team9300.robot.RobotMap;
import org.usfirst.frc4048.swerve.drive.BaseEnclosure;
import org.usfirst.frc4048.swerve.drive.CanTalonSwerveEnclosure;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/*            --- LAYOUT ---
*
*                 Front
*      Wheel 2 ------------ Wheel 1    ---
*          |                 |           |
*          |                 |           |
*          |                 |           |
*    Left  |                 |  Right    |-- Length
*          |                 |           |
*          |                 |           |
*          |                 |           |
*      Wheel 3 ------------ Wheel 4    ---
*                 Back
*
*          |                 |
*          |----- Width -----|
*/

/**
 * Knight Of Ni's Swerve Drive
 */
public class Drivetrain extends Subsystem {
	private BaseEnclosure swerveEnclosure1;
	private BaseEnclosure swerveEnclosure2;
	private BaseEnclosure swerveEnclosure3;
	private BaseEnclosure swerveEnclosure4;
	private SwerveDrive swerveDrive;
	
	public static final double GEAR_RATIO = (1988d/1.2);
	private static final double L = 21.0;
	private static final double W = 23.5;
	
	private WPI_TalonSRX driveMotor1;
	private WPI_TalonSRX driveMotor2;
	private WPI_TalonSRX driveMotor3;
	private WPI_TalonSRX driveMotor4;
	
	private WPI_TalonSRX steerMotor1;
	private WPI_TalonSRX steerMotor2;
	private WPI_TalonSRX steerMotor3;
	private WPI_TalonSRX steerMotor4;
	
	public Drivetrain() {
	}
	
	public void init() {

		swerveEnclosure1 = new CanTalonSwerveEnclosure("enc 1", driveMotor1, steerMotor1, GEAR_RATIO);
		swerveEnclosure2 = new CanTalonSwerveEnclosure("enc 2", driveMotor2, steerMotor2, GEAR_RATIO);
		swerveEnclosure3 = new CanTalonSwerveEnclosure("enc 3", driveMotor3, steerMotor3, GEAR_RATIO);
		swerveEnclosure4 = new CanTalonSwerveEnclosure("enc 4", driveMotor4, steerMotor4, GEAR_RATIO);

		swerveDrive = new SwerveDrive(swerveEnclosure1, swerveEnclosure2, swerveEnclosure3, swerveEnclosure4, W, L);
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
}

