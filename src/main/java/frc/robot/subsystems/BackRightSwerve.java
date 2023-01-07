// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.Encoder;

public class BackRightSwerve extends SwerveUnit {
  /** Creates a new FrontLeftSwerve. */
  public BackRightSwerve(TalonFX rotationMotor, TalonFX driveMotor, Encoder encoder) {
    super(rotationMotor, driveMotor, encoder, false, false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
