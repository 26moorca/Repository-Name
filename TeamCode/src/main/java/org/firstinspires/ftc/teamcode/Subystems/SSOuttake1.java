package org.firstinspires.ftc.teamcode.Subystems;

import com.qualcomm.robotcore.hardware.DcMotor;
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

    }

    public void stopOuttake(){

    }
}
