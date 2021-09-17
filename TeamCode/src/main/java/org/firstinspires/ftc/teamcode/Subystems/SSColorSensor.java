package org.firstinspires.ftc.teamcode.Subystems;
import com.qualcomm.robotcore.hardware.ColorSensor;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import static android.graphics.Color.argb;

public class SSColorSensor {

    ColorSensor colorSensor;
    int white = argb(0, 0, 0, 0);
    int yellow = argb(255, 174, 0, 1);
    Telemetry telemetry;

    public SSColorSensor(ColorSensor color_sensor){
        colorSensor = color_sensor;
    }

    public void isSphereDetected(){
        if(colorSensor.argb() == white) {
            telemetry.addLine("Object is sphere");
        }
    }

    public void isCubeDetected(){
        if(colorSensor.argb() == yellow){
            telemetry.addLine("Object is cube");
        }
    }


}



