package com.company.command;

import com.company.command.commands.EverythingOffCommand;
import com.company.command.commands.EverythingOnCommand;
import com.company.command.commands.KitchenLightsOffCommand;
import com.company.command.commands.KitchenLightsOnCommand;
import com.company.command.hardware.KitchenLights;
import com.company.command.hardware.Music;

/**
 * (Behavioural)
 * An object is used to encapsulate all information needed
 * to perform an action or to trigger asn event at a later time.
 * This information includes the method name, the object that owns the
 * method and values for the method parameters.
 *
 * We have different hardware/components which implements its own behaviour.
 * We have a Command interface which contains a main execute() method.
 * We have Command implementations for each hardware/component (On/Off), and
 * even for multiple hardware/components.
 * We have a main Controller (AlexaDevice) which store lists of commands, and
 * defines the execution of the different commands (on/off).
 * Finally, we use this device to store and execute the commands as needed, so that
 * each Command implementation is responsible for routing the request to the
 * appropriate hardware/component.
 */
public class CommandMain {
    public static void main(String[] args) {
        //Example 1 - Empty slots
        AlexaDevice alexa = new AlexaDevice();
        System.out.println(alexa);

//      ---------------------------------------------------------------

        //Example 2 - Kitchen Lights on
        alexa = new AlexaDevice();

        //Create an instance
        KitchenLights kitchenLights = new KitchenLights();

        //Set the slots with new commands
        alexa.setCommand(
                0,
                new KitchenLightsOnCommand(kitchenLights),
                new KitchenLightsOffCommand(kitchenLights)
        );

        System.out.println(alexa);

        alexa.activateSlot(0);
        alexa.deactivateSlot(0);

//      ---------------------------------------------------------------

        //Example 3 - Everything on!
        alexa = new AlexaDevice();

        //Create an instance
        kitchenLights = new KitchenLights();
        Music music = new Music();

        //Set the slots with new commands
        alexa.setCommand(
                1,
                new EverythingOnCommand(music, kitchenLights),
                new EverythingOffCommand(music, kitchenLights)
        );

        System.out.println(alexa);

        alexa.activateSlot(1);
        alexa.deactivateSlot(1);
    }
}
