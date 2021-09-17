package org.firstinspires.ftc.teamcode.Controller;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Gamepad2 {
    public class Gamepad1 {

        Gamepad gamepad2;
        Telemetry telemetry;



        public Gamepad1(Gamepad gamepad) {
            gamepad2 = gamepad;
        }

        public void gamepadAction() {
            if(gamepad2.a) {
                telemetry.addLine("Button A selected");
                telemetry.update();
                }

            if(gamepad2.b) {
                telemetry.addLine("Button B selected");
                telemetry.update();
            }

            if(gamepad2.x) {
                telemetry.addLine("Button X selected");
                telemetry.update();
            }

            if(gamepad2.y) {
                telemetry.addLine("Button Y selected");
                telemetry.update();
            }

                telemetry.addData("left-trigger: ", gamepad2.left_trigger);
                telemetry.update();

                telemetry.addData("right-trigger: ", gamepad2.right_trigger);
                telemetry.update();

            if(gamepad2.dpad_down){
                telemetry.addLine("dpad down");
                telemetry.update();
            }

            if(gamepad2.dpad_up){
                telemetry.addLine("dpad up");
                telemetry.update();
            }

            if(gamepad2.dpad_right){
                telemetry.addLine("dpad right");
                telemetry.update();
            }

            if(gamepad2.dpad_left){
                telemetry.addLine("dpad left");
                telemetry.update();
            }

            if(gamepad2.left_bumper){
                telemetry.addLine("left bumper");
                telemetry.update();
            }

            if(gamepad2.right_bumper){
                telemetry.addLine("right bumper");
                telemetry.update();
            }
        }
    }
}
