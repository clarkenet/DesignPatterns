package com.company.command.commands;

import com.company.command.hardware.KitchenLights;

public class KitchenLightsOnCommand implements Command {
    KitchenLights kitchenLights;

    public KitchenLightsOnCommand(KitchenLights kitchenLights) {
        this.kitchenLights= kitchenLights;
    }

    @Override
    public void execute() {
        kitchenLights.on();
    }
}
