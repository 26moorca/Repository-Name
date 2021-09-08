package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="SuperStellar First TeleOp")
public class FirstTeleop extends LinearOpMode {
    DcMotor front_left_wheel;
    DcMotor front_right_wheel;
    DcMotor back_left_wheel;
    DcMotor back_right_wheel;
    @Override
    public void runOpMode() throws InterruptedException {
        front_left_wheel = hardwareMap.dcMotor.get("front_left_wheel");
        front_right_wheel = hardwareMap.dcMotor.get("front_right_wheel");
        back_left_wheel = hardwareMap.dcMotor.get("back_left_wheel");
        back_right_wheel = hardwareMap.dcMotor.get("back_right_wheel");

        front_right_wheel.setDirection(DcMotorSimple.Direction.REVERSE);
        back_right_wheel.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive()){

            double frontLeftPower = (gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x)/3;
            double frontRightPower = (gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x)/3;
            double backLeftPower = (gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x)/3;
            double backRightPower = (gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x)/3;



            front_left_wheel.setPower(frontLeftPower);
            front_right_wheel.setPower(frontRightPower);
            back_left_wheel.setPower(backLeftPower);
            back_right_wheel.setPower(backRightPower);
        }
    }
}
