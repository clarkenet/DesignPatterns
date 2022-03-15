package com.company.command.commands;

import com.company.command.hardware.KitchenLights;
import com.company.command.hardware.Music;

public class EverythingOffCommand implements Command {
    Music music;
    KitchenLights kitchenLights;

    public EverythingOffCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        System.out.println("--- PARTY TIME OVER! ---");
        kitchenLights.off();
        music.off();
        music.setVolume(0);
        music.setStation(0);
    }
}
