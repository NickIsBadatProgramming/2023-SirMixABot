// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.sensors.CANCoder;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants.SwerveConstants;

public class BackLeftSwerve extends SwerveUnit {
  /** Creates a new FrontLeftSwerve. */
  public BackLeftSwerve(TalonFX rotationMotor, TalonFX driveMotor, CANCoder encoder) {
    super(rotationMotor, driveMotor, encoder, true, false, SwerveConstants.BL_Zero);
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Back Left Raw Encoder Value", this.encoder.getAbsolutePosition());
    getRawAngle();
    SmartDashboard.putNumber("Back Left Encoder Zeroed Value", this.rawAngle);
  }
}
