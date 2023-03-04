// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.AutonomousConstants;

public class Vision extends SubsystemBase {

  //Positional Variables

  private double tx, ty, tz, az; //Translational values and angles

  private long target; 

  //NetworkTables Stuff
  NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");




  /** Creates a new Vision. */
  public Vision() {
    System.out.println("Vision was created");
  }

  public boolean isTarget() {
    if(target == 1) {
      return true;
    }
    return false;
  }

  public double tx() {
    return this.tx - AutonomousConstants.limelightXOffset;
  }

  public double ty() {
    return this.ty - AutonomousConstants.limelightYOffset;
  }

  public double tz() {
    return this.tz - AutonomousConstants.limelightZOffset;
  }

  public double az() {
    return this.az;
  }

  public long target() {
    return this.target;
  }

  public String targetName () {
    return AutonomousConstants.IntToApriltags[Math.round(this.target())];
  }

  public void update() {
    Number[] defaultNumber = {0,0,0,0,0,0};
    Number[] array = table.getEntry("camtran").getNumberArray(defaultNumber);
    this.tx = array[0].doubleValue();
    this.ty = array[1].doubleValue();
    this.tz = array[2].doubleValue();
    this.az = array[5].doubleValue();
    this.target = table.getEntry("tv").getInteger(0); 
  }



  @Override
  public void periodic() {
    //This method will be called once per scheduler run
    Number[] defaultNumber = {0,0,0,0,0,0};
    Number[] array = table.getEntry("camtran").getNumberArray(defaultNumber);
    this.tx = array[0].doubleValue();
    this.ty = array[1].doubleValue();
    this.tz = array[2].doubleValue();
    this.az = array[5].doubleValue();
    this.target = table.getEntry("tv").getInteger(0); 
  }
}
