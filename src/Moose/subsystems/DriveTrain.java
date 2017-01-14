/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moose.subsystems;

import Moose.RobotMap;
import Moose.commands.DriveWithJoysticks;
import Moose.commands.Lifting;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Spacemike2
 */
public class DriveTrain extends Subsystem {

    public RobotDrive drive;
    Victor left, right;
    
    public DriveTrain(int leftport, int rightport)
    {
        left = new Victor(leftport);
        right = new Victor(rightport);
        
        drive = new RobotDrive(left, right);
    }
    
    public void arcadeDrive(Joystick stick)
    {
        left.set(1);
        right.set(-1);
        //drive.arcadeDrive(stick);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticks());    
    }
    
}
