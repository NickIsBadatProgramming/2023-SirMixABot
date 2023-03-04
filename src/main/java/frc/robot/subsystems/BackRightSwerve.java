// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*----- This class is used solely for smartDashboard values and to work with command-based programming */
//Most of the code for this should be in SwerveUnit

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.sensors.CANCoder;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants.SwerveConstants;

public class BackRightSwerve extends SwerveUnit {
  /** Creates a new FrontLeftSwerve. */
  public BackRightSwerve(TalonFX rotationMotor, TalonFX driveMotor, CANCoder encoder) {
    super(rotationMotor, driveMotor, encoder, false, false, SwerveConstants.BR_Zero);
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Back Right Raw Encoder Value", this.encoder.getAbsolutePosition());
  }
}
