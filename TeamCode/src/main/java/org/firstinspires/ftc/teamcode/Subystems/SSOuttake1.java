package org.firstinspires.ftc.teamcode.Subystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SSOuttake1 {
    //Lydia

    DcMotor upperOuttakeMotor;
    DcMotor lowerOuttakeMotor;

    public SSOuttake1(HardwareMap hardwareMap) {
        upperOuttakeMotor = hardwareMap.dcMotor.get("upper_outtake_motor");
        lowerOuttakeMotor = hardwareMap.dcMotor.get("lower_outtake_motor");
    }

    public void initOuttake(){

    }

    public void startOuttake(){
        upperOuttakeMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        lowerOuttakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        upperOuttakeMotor.setPower(0.5);
        lowerOuttakeMotor.setPower(0.5);
    }

    public void stopOuttake(){
        upperOuttakeMotor.setPower(0);
        lowerOuttakeMotor.setPower(0);
    }
}
