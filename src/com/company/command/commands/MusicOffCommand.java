package com.company.command.commands;

import com.company.command.hardware.Music;

public class MusicOffCommand implements Command {
    Music music;

    public MusicOffCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.setVolume(0);
        music.setStation(0);
        music.off();
    }
}
