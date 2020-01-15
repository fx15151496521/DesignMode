package com.exercise.command;

import com.exercise.command.method.Command;
import com.exercise.command.method.CommandModulController;
import com.exercise.command.method.LightOffCommand;
import com.exercise.command.method.LightOnCommand;
import com.exercise.command.method.MacroCommand;
import com.exercise.command.method.StereoAddVolCommand;
import com.exercise.command.method.StereoOffCommand;
import com.exercise.command.method.StereoOnCommand;
import com.exercise.command.method.StereoSubVolCommand;
import com.exercise.command.model.Light;
import com.exercise.command.model.Stereo;

/**
 * @Description:
 * @Date: 2020/1/15 17:07
 */
public class ControllerTest {

    public static void main(String[] args) {
        CommandModulController controller = new CommandModulController();
        MacroCommand onMacro, offMacro;
        Light bedroomLight = new Light("Bedroom");
        Light kitchLight = new Light("Kitch");
        Stereo stereo = new Stereo();

        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);
        LightOnCommand kitchLightOn = new LightOnCommand(kitchLight);
        LightOffCommand kitchLigthOff = new LightOffCommand(kitchLight);

        Command[] onCommands = {bedroomLightOn, kitchLightOn};
        Command[] offCommands = {bedroomLightOff, kitchLigthOff};

        onMacro = new MacroCommand(onCommands);
        offMacro = new MacroCommand(offCommands);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        StereoAddVolCommand stereoAddVol = new StereoAddVolCommand(stereo);
        StereoSubVolCommand stereoSubVol = new StereoSubVolCommand(stereo);

        controller.setCommand(0, bedroomLightOn, bedroomLightOff);
        controller.setCommand(1, kitchLightOn, kitchLigthOff);
        controller.setCommand(2, stereoOn, stereoOff);
        controller.setCommand(3, stereoAddVol, stereoSubVol);
        controller.setCommand(4, onMacro, offMacro);

        controller.onCommand(0);
        controller.undoCommand();
        controller.onCommand(1);
        controller.offCommand(1);
        controller.onCommand(4);
    }
}
