
package Moose.commands;

import Moose.OI;
import Moose.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import Moose.subsystems.DriveTrain;

/**
 *
 * @author Team1065
 */
public class DriveWithJoysticks extends CommandBase {
    
    
    public DriveWithJoysticks() {
        requires(drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
        CommandBase.drive.arcadeDrive(CommandBase.oi.getstick());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
