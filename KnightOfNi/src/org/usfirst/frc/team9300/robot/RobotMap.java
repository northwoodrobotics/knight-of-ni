/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team9300.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	/*       --- DRIVETRAIN LAYOUT ---
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
	
	public static final int DRIVETRAIN_CAN_TALON_1 = 0;
	public static final int DRIVETRAIN_CAN_TALON_2 = 1;
	public static final int DRIVETRAIN_CAN_TALON_3 = 2;
	public static final int DRIVETRAIN_CAN_TALON_4 = 3;
	public static final int DRIVETRAIN_CAN_TALON_5 = 4;
	public static final int DRIVETRAIN_CAN_TALON_6 = 5;
	public static final int DRIVETRAIN_CAN_TALON_7 = 6;
	public static final int DRIVETRAIN_CAN_TALON_8 = 7;
}
