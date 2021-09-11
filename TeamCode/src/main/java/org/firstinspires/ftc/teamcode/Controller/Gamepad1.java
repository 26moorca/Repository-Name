package org.firstinspires.ftc.teamcode.Controller;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.robotcore.external.Telemetry;


public class Gamepad1 {

    Gamepad gamepad1;
    Telemetry telemetry;
    float x_value_left = 0;
    float y_value_left = 0;
    float x_value_right = 0;
    float y_value_right = 0;

    public Gamepad1(Gamepad gamepad) {
        gamepad1 = gamepad;
    }

    public void gamepadAction(){
        x_value_left = gamepad1.left_stick_x;
        y_value_left = gamepad1.left_stick_y;
        x_value_right = gamepad1.right_stick_x;
        y_value_left = gamepad1.right_stick_y;
        telemetry.addData("x-value left:", x_value_left);
        telemetry.addData("y-value left:", y_value_left);
        telemetry.addData("x-value right", x_value_right);
        telemetry.addData("y-value right", y_value_right);
        telemetry.update();
    }
}
