// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Chassis extends SubsystemBase {
  //Create chassis motor variables
  TalonFX rightChassisMotor = null;
  TalonFX leftChassisMotor = null;

  //Create Differential Drive
  DifferentialDrive differentialDrive = null;

  /** Creates a new Drivetrain. */
  public Chassis() {
    //Initialize chassis motors
    rightChassisMotor = new TalonFX(Constants.CHASSIS_RIGHT_TALONFX);
    leftChassisMotor = new TalonFX(Constants.CHASSIS_LEFT_TALONFX);

    differentialDrive = new DifferentialDrive(leftChassisMotor, -rightChassisMotor);
  }
  
  public void chassisDrive(double moveSpeed, double rotateSpeed) {
    differentialDrive.tankDrive(moveSpeed, rotateSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
