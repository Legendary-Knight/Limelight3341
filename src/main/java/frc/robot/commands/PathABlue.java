// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class PathABlue extends SequentialCommandGroup {
  /** Creates a new PathABlue. */
  public PathABlue() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new DriveForward(150), 
                new TurnRobot(-71), 
                new DriveForward(95), 
                new TurnRobot(98), 
                new DriveForward(67), 
                new TurnRobot(-27), 
                new DriveForward(90)
              );
  }
}
