package com.company.command.commands;

import com.company.command.hardware.KitchenLights;
import com.company.command.hardware.Music;

public class EverythingOnCommand implements Command {
    Music music;
    KitchenLights kitchenLights;

    public EverythingOnCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        System.out.println("--- ITS PARTY TIME! ---");
        kitchenLights.on();
        music.on();
        music.setVolume(10);
        music.setStation(102.1F);
    }
}
